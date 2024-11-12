package com.example.counterapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/counter-api")
public class CounterController {

    private final ParagraphStorage paragraphStorage;

    public CounterController(ParagraphStorage paragraphStorage) {
        this.paragraphStorage = paragraphStorage;
    }

    @PostMapping("/search")
    public ResponseEntity<Map<String, Object>> searchCounts(@RequestBody Map<String, List<String>> request) {
        List<String> searchText = request.get("searchText");
        Map<String, Integer> counts = paragraphStorage.countWords(searchText);
        return ResponseEntity.ok(Map.of("counts", counts));
    }

    @GetMapping(value = "/top/{limit}", produces = "text/csv")
    public ResponseEntity<String> getTopCounts(@PathVariable int limit) {
        if (limit <= 0) {
            return ResponseEntity.badRequest().body("Limit must be a positive number.");
        }

        List<Map.Entry<String, Integer>> topWords = paragraphStorage.getTopWords(limit);
        StringBuilder csvBuilder = new StringBuilder();
        topWords.forEach(entry -> csvBuilder.append(entry.getKey()).append('|').append(entry.getValue()).append('\n'));

        return ResponseEntity.ok()
                .header("Content-Type", "text/csv")
                .body(csvBuilder.toString());
    }

}



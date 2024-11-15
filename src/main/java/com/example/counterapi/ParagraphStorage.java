package com.example.counterapi;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParagraphStorage {
    private static final String PARAGRAPH = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla sed suscipit metus, sit amet tristique purus. Etiam sit amet leo sollicitudin, tincidunt lectus vel, ultricies mauris. Donec ultrices lorem in est eleifend, et feugiat libero semper. Duis sodales gravida sapien eget efficitur. Ut mattis mollis blandit. Duis nec metus gravida, posuere dolor id, pretium urna. Aliquam vitae purus ex. Etiam vitae ipsum leo. Integer blandit, arcu eget commodo scelerisque, risus leo aliquet diam, in sagittis metus ex sed elit. Duis vel urna non est fringilla rutrum. Ut molestie sed risus in pharetra. Maecenas eget ante at nulla feugiat euismod. Suspendisse pharetra porttitor lacus non tristique. Vivamus varius posuere ligula. Nullam magna metus, elementum vel elementum eu, elementum non magna. Ut cursus arcu vel ligula mollis, in interdum velit maximus. Pellentesque arcu lorem, porttitor et quam vitae, imperdiet venenatis magna. Etiam imperdiet erat vel lectus rhoncus sollicitudin. Praesent at mi a est suscipit tempor sed eu diam. In hac habitasse platea dictumst. Morbi erat mi, iaculis id hendrerit a, sollicitudin et ligula. Vivamus justo nibh, cursus at ultricies sed, varius iaculis enim. Donec consequat luctus sapien, quis aliquam ante tristique sit amet. Pellentesque accumsan sollicitudin mi a blandit. Donec ac dui bibendum, pharetra nulla vitae, iaculis purus. Donec fermentum porttitor mollis. Mauris cursus fringilla ex, eget ullamcorper ipsum lacinia in. Nam eget vehicula dui. In eget turpis convallis, ultrices neque vitae, interdum turpis. Nullam non aliquam sapien, eget volutpat elit. Cras pharetra ex a orci faucibus tristique at ullamcorper nibh. Proin nec lacinia ante, eu rutrum sem. Curabitur id libero purus. Vivamus vel velit turpis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec at urna eget augue efficitur porttitor at eu elit. Fusce feugiat tempor nulla, at euismod lacus tincidunt sed. Curabitur ullamcorper dignissim nisl, eget iaculis orci vestibulum sed. Ut consectetur consectetur urna vestibulum ultricies. Maecenas non felis arcu. Fusce in tortor metus. Vestibulum vel felis ut lorem ultricies pretium quis ut metus. Aliquam erat volutpat. Praesent a lorem porttitor, venenatis nisl volutpat, placerat dui. Vivamus ut justo eu orci tincidunt malesuada. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam facilisis nulla vel leo pretium varius. Fusce eleifend tincidunt lacinia. Duis maximus, sapien ac fringilla pretium, augue leo aliquam ligula, quis rutrum leo sem vel magna. Duis commodo lobortis dui, ut rhoncus dolor. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nam nec augue augue. Quisque eu orci arcu. Aliquam neque odio, eleifend a dolor sed, dapibus auctor justo. Aliquam sollicitudin arcu sit amet odio gravida, nec viverra nulla efficitur. Phasellus sed libero rutrum lacus sollicitudin mattis. Sed fermentum sapien ac dolor elementum, quis vehicula sem tempus. Etiam et orci non orci lobortis dictum id vitae massa. Aenean eu erat nulla. Sed posuere ullamcorper magna, tempor ultrices justo feugiat rhoncus. Cras fringilla ligula nec euismod tristique. Duis vitae enim eget augue consectetur ultricies. Nam laoreet sapien at dictum consectetur. Suspendisse tristique purus neque, ut blandit nunc tincidunt et. Duis pretium condimentum diam id viverra. Pellentesque sit amet dapibus eros, ac auctor lectus. Praesent eget tellus purus. Proin vel nisl sit amet orci laoreet faucibus eget eu nisi. Nulla id pharetra arcu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ornare lectus eu metus venenatis, quis porttitor nibh convallis. Nulla nunc metus, tristique quis dui sed, interdum imperdiet nisl. Vestibulum mattis tincidunt lacus, imperdiet mattis libero varius rhoncus. Nam in auctor nisl. Nunc tincidunt accumsan pulvinar. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Mauris luctus scelerisque augue, vel finibus ligula semper vel. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nunc ultricies vel nunc eget mollis. Donec ligula felis, ultrices vel blandit ut, hendrerit vel turpis. Duis faucibus dapibus mi ac semper. Duis id tortor tempus augue euismod tempus. Integer vehicula velit ut leo blandit sagittis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nunc ut urna vel metus molestie venenatis nec non dui. Integer diam metus, aliquam a gravida et, varius id nulla. Nunc non porttitor ipsum. Aliquam sapien enim, eleifend nec nunc id, tempus tempus ex. Vivamus nec urna ornare, finibus leo at, posuere urna. Aenean est mi, porta ac gravida at, hendrerit quis elit. Quisque urna mauris, lobortis sit amet tortor eget, laoreet consectetur tortor. Suspendisse id imperdiet nisl, eget pellentesque tortor. Maecenas sit amet mi et ex ornare porta sollicitudin vitae tellus. Donec nulla lorem, imperdiet non sodales vitae, congue quis sapien. Quisque nec mattis lacus. Sed dapibus nisi nec libero ornare, in accumsan dolor porttitor. Praesent sodales commodo ultricies. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras id ipsum vestibulum, venenatis eros vitae, maximus magna. Mauris eu blandit tortor, condimentum eleifend dolor. Cras eu tellus feugiat, lobortis metus ac, consectetur orci. Phasellus bibendum tincidunt massa non venenatis. Nunc sed molestie metus, vel elementum tortor. Duis malesuada porta nisl ac molestie. In a tellus faucibus, convallis nunc nec, sodales lacus. Donec vulputate interdum massa sed posuere. In dapibus eu ligula at sodales. Sed facilisis a sem eget lobortis. Ut viverra ipsum dictum pharetra auctor. Duis tincidunt nulla sapien, sit amet facilisis ante rhoncus eu. Aliquam luctus dolor tortor, vitae interdum felis elementum eget. Nam mattis leo gravida ex elementum, id facilisis lacus ornare.";

    // 方法1：统计关键词出现次数
    public Map<String, Integer> countWords(List<String> searchText) {
        String[] words = PARAGRAPH.toLowerCase().split("\\W+"); // 分割，并转换为小写
        Map<String, Integer> counts = new HashMap<>();
        // 关键词转换为小写
        searchText.forEach(text -> counts.put(text.toLowerCase(), 0));

        // 遍历
        for (String word : words) {
            if (counts.containsKey(word)) {
                counts.put(word, counts.get(word) + 1);
            }
        }
        return counts;
    }

    // 方法2：获取出现次数最多的N个单词
    public List<Map.Entry<String, Integer>> getTopWords(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Limit must be a positive number.");
        }

        String[] words = PARAGRAPH.toLowerCase().split("\\W+"); // 分割并转换为小写
        if (words.length == 0) {
            throw new IllegalStateException("No words found in the paragraph.");
        }

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(Math.min(limit, wordCounts.size())) // 确保 limit 不超出单词总数
                .collect(Collectors.toList());
    }


}

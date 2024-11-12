# CounterAPI

A simple Spring Boot project for counting words and retrieving top N frequent words in a paragraph.

## Features
- Count the occurrences of specific words in a predefined paragraph.
- Retrieve the top N most frequent words in the paragraph.

## Endpoints
- `POST /counter-api/search` - Count specific words.
- `GET /counter-api/top/{limit}` - Get top N frequent words in CSV format.

## Tech Stack
- Java 21
- Spring Boot
- Spring Security

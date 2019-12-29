# SimpleNotepad

Kotlin + Spring Bootで簡易メモアプリ  
お気に入りのラーメン屋を登録したりと意外と汎用性ありそう  

## Impressions
- Android studio、RailsもMVCなのでなんとなく理解できたような気がする😅

- PUTとDELETEでRequest method 'POST' not supported（405エラー）が発生  
  ググっても解決につながる情報が得られなかった為、GETで実装して回避しました  

- 次回はPostgreSQLを用いることでDBの理解を深めたい  
  
## Dependencies(備忘録)
- Kotlin
- Spring Boot
  - DevTools  （開発補助モジュール）
  - JPA       （JPAの機能をベースに 汎用的な Repositoryの機能を提供）
  - H2        （インメモリDB）
  - Web       （エンドポイントを簡単に作れる）
  - Thymeleaf （テンプレートエンジン）

### 参考
https://qiita.com/ozaki25/items/301d43dfcb1903ef995b

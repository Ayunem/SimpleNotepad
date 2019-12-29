# SimpleNotepad

Kotlin + Spring Bootで簡易メモアプリ  
お気に入りのラーメン屋を登録したりと意外と汎用性ありそう  

## Impressions
- Android studioもMVCなのでなんとなく理解できたような気がする😅

- putとdeleteでRequest method 'POST' not supported（405エラー）が発生  
  ググっても有用な情報がないため、すべてgetで実装して回避しました  

- 次回はPostgreSQLを用いることでDBの理解を深めたい


- Kotlin
- Spring Boot
  - DevTools　（開発補助モジュール）
  - JPA　（JPAの機能をベースに 汎用的な Repositoryの機能を提供）
  - H2　（インメモリDB）
  - Web　（エンドポイントを簡単に作れる）
  - Thymeleaf  （テンプレートエンジン）

### 参考
https://qiita.com/ozaki25/items/301d43dfcb1903ef995b

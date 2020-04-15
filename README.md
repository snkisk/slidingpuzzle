# slidingpuzzle

## ローカル環境での動作確認
1. プロジェクトルートで以下コマンド実行.
```sh
./gradlew bootRun
```

2. `http://localhost:8080` へアクセス.

### ホットデプロイの方法
ファイル変更の都度 `./gradlew bootRun` するのが億劫ので以下方法を推奨する.
`./gradlew bootRun` 実行中に以下コマンド実行.

```sh
$ ./gradlew build -t
```

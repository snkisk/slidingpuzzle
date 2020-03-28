# slidingpuzzle

## ローカル環境での動作確認
1. プロジェクトルートで以下コマンド実行.
```sh
./gradlew bootRun
```

2. `http://localhost:8080` へアクセス.

### ホットデプロイの方法
ファイル変更の都度 `./gradlew bootRun` するのが億劫ので以下方法を推奨する.
1. inotify-tools のインストール(インストール済みの場合はスキップ).
```sh:ubuntu
$ sudo apt-get install inotify-tools
```

2. プロジェクトルートで以下コマンド実行.
`./gradlew bootRun` を実行した上で実行.
```sh:ubuntu
$ inotifywait -e create,delete,modify,move -mr src|while read;do while read -t 0.3;do :;done;./gradlew classes;done
```

# Java の課題

## 課題

1. コンソールに「Hello, World」を表示する
1. コンソールに「Hello, World」を 5 回繰り返して表示する
1. コンソールから文字列を読み取ってそれを表示する
1. コンソールから文字列を読み取って、読み取った文字列を数字に変換し、その回数繰り返してコンソールに「Hello, World」を表示する
1. 1 から 100 までコンソールに表示する。ただし、3 の倍数は Fizz を表示する
1. 1 から 100 までコンソールに表示する。ただし、5 の倍数は Buzz を表示する
1. 1 から 100 までコンソールに表示する。ただし、3 の倍数は Fizz、5 の倍数は Buzz、3 と 5 の倍数は FizzBuzz を表示する
1. コンソールから数値を読み取って、その数値が素数かどうか判定する

## プロジェクトの作成

1. 以下のコマンドを実行してプロジェクトを作成します

```cmd
scripts\create-java-project excercise1
```

```powershell
.\scripts\create-java-project.cmd excercise1
```

2. プロジェクトのフォルダに移動します

```
dir excercise1
```

3. 以下のコマンドを実行しプロジェクトをコンパイルします

```
mvn compile
```

※上記のコマンドを実行することで、excecise1 フォルダの target\classes 内に class ファイルが作成されます。

4. コンパイルされたプログラムを実行する

```
java -cp target\classes excercise1.App
```

## 事前準備

1. JDK8 をインストール
1. Maven をインストール

**JDK8 をインストール**

1. [Oracle のサイト](http://www.oracle.com/technetwork/java/javase/downloads/index.html)より、JDKをダウンロードする
1. ダウンロードしたファイルをインストールする
1. インストールが完了したら環境変数に JAVA_HOME を追加する

**Maven をインストール**

1. [Maven のサイト](https://maven.apache.org/download.cgi) より、Maven の Binary zip archive (例: バージョン 3.5.4 をインストール) をダウンロードする
1. ダウンロードしたファイルを解凍して ```C:\Program Files\apache-maven-3.5.4```に展開する
1. 環境変数の PATH に ```C:\Program Files\apache-maven-3.5.4\bin``` を追加する
1. コマンドプロンプトを開いて ```mvn --version``` と打ってバージョンが表示されることを確認する

**環境変数の追加について**

環境変数について知りたい場合は以下のサイトを参考にすること

- [環境変数 - Wikipedia](https://ja.wikipedia.org/wiki/%E7%92%B0%E5%A2%83%E5%A4%89%E6%95%B0)
- [Windows で環境変数 PATH をいじる方法のまとめ](https://qiita.com/sta/items/6d29da0dc7069ffaae60)

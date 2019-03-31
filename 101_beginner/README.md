# Java の課題 (初級編)

**注意 (Windows ユーザー): 各ファイルで日本語を使用する場合は Shift JIS で保存するかコンパイル時に ```-encoding UTF-8``` のオプションを指定する**

1. 事前準備を参考に Java の環境を構築する

## 課題

1. コンソールに「Hello, World」を表示する
1. コンソールに「Hello, World」を 5 回繰り返して表示する
1. コンソールから文字列を読み取ってそれを表示する
1. コンソールから文字列を読み取って、読み取った文字列を数字に変換し、その回数繰り返してコンソールに「Hello, World」を表示する
1. 1 から 100 までコンソールに表示する。ただし、3 の倍数は Fizz を表示する
1. 1 から 100 までコンソールに表示する。ただし、5 の倍数は Buzz を表示する
1. 1 から 100 までコンソールに表示する。ただし、3 の倍数は Fizz、5 の倍数は Buzz、3 と 5 の倍数は FizzBuzz を表示する
1. コンソールから数値を読み取って、その数値が素数かどうか判定する
1. コンソールから文字列を読み取って、読み取った文字列を数値に変換する (※ただし Scanner#nextInt、Integer#parseInt 等を使用しないこと)

## Java アプリケーションの実行方法

1. .java ファイルをコンパイルする

```cmd
C:\excercise-java\101_beginner>javac Excercise1.java
```

コンパイルすることで .java ファイルのあるフォルダに .class ファイルが作成されます

2. .class ファイルを実行する

```cmd
C:\excercise-java\101_beginner>java Excercise1
```

3. 実行結果

```cmd
Hello, World!
```

## 事前準備

1. JDK8 をインストール
1. [Oracle のサイト](http://www.oracle.com/technetwork/java/javase/downloads/index.html)より、JDKをダウンロードする
1. ダウンロードしたファイルをインストールする
1. インストールが完了したら環境変数に JAVA_HOME を追加する

**環境変数の追加について**

環境変数について知りたい場合は以下のサイトを参考にすること

- [環境変数 - Wikipedia](https://ja.wikipedia.org/wiki/%E7%92%B0%E5%A2%83%E5%A4%89%E6%95%B0)
- [Windows で環境変数 PATH をいじる方法のまとめ](https://qiita.com/sta/items/6d29da0dc7069ffaae60)


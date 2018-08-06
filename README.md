# Java の課題

**注意 (Windows ユーザー): 各ファイルで日本語を使用する場合は Shift JIS で保存すること**

## 課題

1. 事前準備を参考に Maven の環境を構築する
1. コンソールに「Hello, World」を表示する
1. コンソールに「Hello, World」を 5 回繰り返して表示する
1. コンソールから文字列を読み取ってそれを表示する
1. コンソールから文字列を読み取って、読み取った文字列を数字に変換し、その回数繰り返してコンソールに「Hello, World」を表示する
1. 1 から 100 までコンソールに表示する。ただし、3 の倍数は Fizz を表示する
1. 1 から 100 までコンソールに表示する。ただし、5 の倍数は Buzz を表示する
1. 1 から 100 までコンソールに表示する。ただし、3 の倍数は Fizz、5 の倍数は Buzz、3 と 5 の倍数は FizzBuzz を表示する
1. コンソールから数値を読み取って、その数値が素数かどうか判定する

## プロジェクトの作成

1. 以下のコマンドを実行して Maven の archetype:generate を archetypeArtifactId 対話モードで開始します

```cmd
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart
```

2. 対話モードの設問に以下のように回答する

```
groupId: com.example
artifactId: excercise1
version: 1.0-SNAPSHOT
package: excercise1
```

入力の例

```
Define value for property 'groupId': com.example
Define value for property 'artifactId': excercise1
Define value for property 'version' 1.0-SNAPSHOT: :
Define value for property 'package' com.example: : excercise1
```

3. Y: に "Y" と入力して Enter キーを押下する

入力の例

```
 Y: : Y
```

4. プロジェクトのフォルダに移動します

```cmd
dir excercise1
```

5. 以下のコマンドを実行しプロジェクトをコンパイルします

```cmd
mvn compile
```

※上記のコマンドを実行することで、excecise1 フォルダの target\classes 内に class ファイルが作成されます。

6. コンパイルされたプログラムを実行する

```cmd
java -cp target\classes excercise1.App
```

7. 5.-6. の手順を簡略化するためには以下のサイトを参考に exec-maven-plugin プラグインを導入するか、バッチファイルを書きます

[Java プログラムを Maven から実行する方法](https://qiita.com/hide/items/0c8795054219d04e5e98)

```cmd
cmd /c mvn compile
if ERRORLEVEL 1 exit /b
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

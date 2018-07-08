# Java �̉ۑ�

**���� (Windows ���[�U�[): �e�t�@�C���œ��{����g�p����ꍇ�� Shift JIS �ŕۑ����邱��**

## �ۑ�

1. ���O�������Q�l�� Maven �̊����\�z����
1. �R���\�[���ɁuHello, World�v��\������
1. �R���\�[���ɁuHello, World�v�� 5 ��J��Ԃ��ĕ\������
1. �R���\�[�����當�����ǂݎ���Ă����\������
1. �R���\�[�����當�����ǂݎ���āA�ǂݎ����������𐔎��ɕϊ����A���̉񐔌J��Ԃ��ăR���\�[���ɁuHello, World�v��\������
1. 1 ���� 100 �܂ŃR���\�[���ɕ\������B�������A3 �̔{���� Fizz ��\������
1. 1 ���� 100 �܂ŃR���\�[���ɕ\������B�������A5 �̔{���� Buzz ��\������
1. 1 ���� 100 �܂ŃR���\�[���ɕ\������B�������A3 �̔{���� Fizz�A5 �̔{���� Buzz�A3 �� 5 �̔{���� FizzBuzz ��\������
1. �R���\�[�����琔�l��ǂݎ���āA���̐��l���f�����ǂ������肷��

## �v���W�F�N�g�̍쐬

1. �ȉ��̃R�}���h�����s���� Maven �� archetype:generate �� archetypeArtifactId �Θb���[�h�ŊJ�n���܂�

```cmd
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart
```

2. �Θb���[�h�̐ݖ�Ɉȉ��̂悤�ɉ񓚂���

```
groupId: com.example
artifactId: excercise1
version: 1.0-SNAPSHOT
package: excercise1
```

���̗͂�

```
Define value for property 'groupId': com.example
Define value for property 'artifactId': excercise1
Define value for property 'version' 1.0-SNAPSHOT: :
Define value for property 'package' com.example: : excercise1
```

3. Y: �� "Y" �Ɠ��͂��� Enter �L�[����������

���̗͂�

```
 Y: : Y
```

4. �v���W�F�N�g�̃t�H���_�Ɉړ����܂�

```cmd
dir excercise1
```

5. �ȉ��̃R�}���h�����s���v���W�F�N�g���R���p�C�����܂�

```cmd
mvn compile
```

����L�̃R�}���h�����s���邱�ƂŁAexcecise1 �t�H���_�� target\classes ���� class �t�@�C�����쐬����܂��B

6. �R���p�C�����ꂽ�v���O���������s����

```cmd
java -cp target\classes excercise1.App
```

7. 5. - 6. �̎菇���ȗ������邽�߂ɂ͈ȉ��̃T�C�g���Q�l�� exec-maven-plugin �v���O�C���𓱓����邩�A�o�b�`�t�@�C���������܂�

[Java �v���O������ Maven ������s������@](https://qiita.com/hide/items/0c8795054219d04e5e98)

```cmd
cmd /c mvn compile
if ERRORLEVEL 1 exit /b
java -cp target\classes excercise1.App
```

## ���O����

1. JDK8 ���C���X�g�[��
1. Maven ���C���X�g�[��

**JDK8 ���C���X�g�[��**

1. [Oracle �̃T�C�g](http://www.oracle.com/technetwork/java/javase/downloads/index.html)���AJDK���_�E�����[�h����
1. �_�E�����[�h�����t�@�C�����C���X�g�[������
1. �C���X�g�[����������������ϐ��� JAVA_HOME ��ǉ�����

**Maven ���C���X�g�[��**

1. [Maven �̃T�C�g](https://maven.apache.org/download.cgi) ���AMaven �� Binary zip archive (��: �o�[�W���� 3.5.4 ���C���X�g�[��) ���_�E�����[�h����
1. �_�E�����[�h�����t�@�C�����𓀂��� ```C:\Program Files\apache-maven-3.5.4```�ɓW�J����
1. ���ϐ��� PATH �� ```C:\Program Files\apache-maven-3.5.4\bin``` ��ǉ�����
1. �R�}���h�v�����v�g���J���� ```mvn --version``` �Ƒł��ăo�[�W�������\������邱�Ƃ��m�F����

**���ϐ��̒ǉ��ɂ���**

���ϐ��ɂ��Ēm�肽���ꍇ�͈ȉ��̃T�C�g���Q�l�ɂ��邱��

- [���ϐ� - Wikipedia](https://ja.wikipedia.org/wiki/%E7%92%B0%E5%A2%83%E5%A4%89%E6%95%B0)
- [Windows �Ŋ��ϐ� PATH ����������@�̂܂Ƃ�](https://qiita.com/sta/items/6d29da0dc7069ffaae60)

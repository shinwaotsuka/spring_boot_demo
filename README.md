
# README

## とりあえずの画面表示

* SampleControllerクラスを作って、index.htmlを作成。

* 以下にアクセス
http://localhost:8080/index

## TODO

* postgresql を再インストール (完了)

* thymeleafを試す(完了)
* DBへの接続処理(完了)
  https://qiita.com/ketman55/items/16d1e491a5a493f71c92
* gitでの管理
* 商品一覧と詳細画面を作ってみる
* CSSを適用
* ユーザーログイン機能追加

* ここまで来たら、追加でやることの整理


## postgresql再インストール

```
brew uninstall postgresql
brew update
brew search postgresql
brew install postgresql@13

psql --version
```

### PostgreSQLの起動
```
brew services start postgresql@13
or
/usr/local/opt/postgresql@13/bin/postgres -D /usr/local/var/postgresql@13

psql postgres
create user postgres SUPERUSER;
exit
psql postgres
¥l
create database demo owner=postgres;
exit
psql demo -U postgres
create table item(id integer, name text);
¥d
```

### 接続情報

```
localhost
5432
postgres
postgres/postgres
```





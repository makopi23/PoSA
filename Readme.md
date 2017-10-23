# 書籍「現場で役立つシステム設計の原則」 写経用リポジトリ  
http://gihyo.jp/book/2017/978-4-7741-9087-7

## 疑問点メモ  

### ■P.31 Quantityクラスのaddメソッド  
addメソッドで100という数字がハードコーディングされているが、定数MAXの方がよいのでは？  
また、100は業務的に正しい値なので、例外メッセージの"以上"は、"超"では？  

【修正前】  
throw new IllegalArgumentException("不正：合計が" + 100 + "以上");  
【修正後】  
throw new IllegalArgumentException("不正：合計が" + MAX + "超");  

→　正誤表に反映いただいた。

### ■P.37 「独自の型を使って意図を明らかにする」のamountメソッドのコード例  
quantityが一定量より多いかの判定ロジックをisDiscountableに閉じ込めるなら、  
isDiscountableはフィールド（プロパティ）ではなくメソッドになるのでは？

■修正前
if(quantity.isDiscountable)

■修正後
if(quantity.isDiscountable())

### ■P.43 Customersクラスのaddメソッド  
コードリストで、Customersコンストラクタの引数にresult.add(customer)を指定しているが、  
ArrayListのaddメソッドの戻り値はboolean型なので、意図した動作にならないのでは？  

■修正前（Customerコンストラクタにboolean型を渡している）  
return new Customers(result.add(customer));  

■修正後（CustomerコンストラクタにArrayList型を渡す）  
result.add(customer);  
return new Customers(result);  

→　正誤表に反映いただいた。

### ■P.58 FeeFactoryのコード例
Map型のフィールド types だが、変数宣言しかしておらずインスタンス生成をしていないので、  
staticブロック内のtypes.putをするタイミングでNullPointerExceptionになるのでは？  

■修正後  (staticブロックの先頭でMapのインスタンスを作成する)  
types = new HashMap<String, Fee>();
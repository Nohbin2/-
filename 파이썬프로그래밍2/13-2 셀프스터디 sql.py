import sqlite3

con, cur = None, None
data1, data2, data3, data4 = "", "", "", ""
sql = ""

con = sqlite3.connect("C:/sqlite-tools-win32-x86-3360000/naverDB")
cur = con.cursor()
cur.execute("CREATE TABLE productTable1(pCode char(5), pName, price int, amount int)")


while (True) :
    data1 = input("사용자ID ==> ")
    if data1 == "":
        break;
    data2 = input("제품명 ==> ")
    data3 = input("가격 ==> ")
    data4 = input("재고수량 ==> ")
    sql = "INSERT INTO productTable1 VALUES('" + data1 + "','" + data2 + "', " + data3 + "," + data4 + ")"
    cur.execute(sql)
    
con.commit()    
con.close()
    

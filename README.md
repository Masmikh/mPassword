# mPassword
You only need [mPassword.java](https://github.com/moslem-pc/mPassword/blob/master/src/ir/moslem_deris/mPassword.java) file. The rest files (Like Main.java) are here just to give examples!
#### What mPassword class does:
* Generates a powerful password _(includes uppercase and lowercase letters, numbers and characters)_ :smiling_imp:
* Rates a string as a password _(percent)_ :sunglasses:

#### Example:
how to use mPassword class:
 ```java
mPassword mP=new mPassword();
mP.setRandomPassword();
System.out.println("A powerful password:");
System.out.println(mP.getPassword());
```
#####or
 ```java
mPassword mP=new mPassword();
mP.setPassword("Qwermy2254");
System.out.print("Rate: " + mP.getRatePercent() + "%");
```
:octocat:

let me know if anything is wrong :wink:

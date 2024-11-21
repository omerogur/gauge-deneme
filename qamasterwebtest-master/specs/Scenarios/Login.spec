# Login Scenarios
a
## TC102 - Başarılı loginin kontrolü
tags: Regresyon, Login
* Login url'i kontrol edilir.
* Email alanına "Data_email" yazılır.
* Continue butonuna tıklanır.
* Password Input Box'ının geldiği doğrulanır.
* Password alanına "Data_password" yazılır.
* Continue butonuna tıklanır.
* Ana sayfa url'i kontrol edilir.
*<key> li elementlerden random bir değere tıkla find elements <key> click on one random value
## TC103 - Şifrenin yazımını görmek için göz butonunun kontrolüq1231231231
tags: Regresyon, Login
* Login url'i kontrol edilir.
* Email alanına "Data_email" yazılır.
* Continue butonuna tıklanır.
* Password Input Box'ının geldiği doğrulanır.
* Password alanına "Data_password" yazılır.
* Password Visibility butonuna tıklanır.rrrrrr
*Project type olarak <text> seçilir. Choose <text> as project type
*<key> li elementin <attr> attribute'ı <attrtext> içeriyor mu? find element <key> and check if <attr> contains <attrtext>?

// ## TC104 - Login olduktan sonra tarayıcıda önce geri sonra ileri gitme tuşunun kontrolü
// tags: Regresyon, Login
// * Login olunur.
// * Geri butonuna tıklanır.
// * Login url'i kontrol edilir.
// * İleri butonuna tıklanır.
// * Login url'i kontrol edilir.
// Bu senaryo bug'dan dolayı passed alamamaktadır.

## TC105 - Sadece önceden oluşturulmuş kullanıcıya ait bilgilerle giriş yapılabileceğinin kontrolü
tags: Regresyon, Login
* Login url'i kontrol edilir.
* Email alanına "Data_email" yazılır.
* Continue butonuna tıklanır.
* Password Input Box'ının geldiği doğrulanır.
* Password alanına "yanlış-şifre" yazılır.
* Password Visibility butonuna tıklanır.
* Continue butonuna tıklanır.
* Incorrect username or password ifadesi kontrol edilir.

# Test Scenarios

## TC401 - Yeni test suit oluşturma pop-up'ının kontrolü
tags: Regresyon, Test
* Login olunur.
* Ana sayfadaki add butonuna tıklanır.
* Ana sayfadaki New Test Suite butonuna tıklanır.
* New Test Suite popup'ı kontrol edilir.

## TC402 - New Test sayfasında sadece "Project Title" seçilip Select butonuna tıklanmasının kontrolü
tags: Regresyon, Test
* Login olunur.
* New Test ekranı açılır.
* New Test ekranında "Proje X" isimli proje seçilir.
* New Test ekranındaki Select butonuna tıklanır.
* Test Senaryolarının görüldüğü kontrol edilir.

## TC403 - New Test sayfasında sadece "Project Title" ve istenilen tag seçilip Select butonuna tıklanmasının kontrolü
tags: Regresyon, Test
* Login olunur.
* New Test ekranı açılır.
* New Test ekranında "Proje X" isimli proje seçilir.
* New Test ekranında "demo10" isimli tag seçilir.
* New Test ekranındaki Select butonuna tıklanır.
* Test Senaryolarının görüldüğü kontrol edilir.

## TC404 - Başarılı test oluşturmanın kontrolü (sadece save)
tags: Regresyon, Test
* Login olunur.
* New Test ekranı açılır.
* New Test ekranında "Proje X" isimli proje seçilir.
* New Test ekranında "demo10.spec" isimli spec seçilir.
* New Test ekranında "demo10" isimli tag seçilir.
* New Test ekranındaki Select butonuna tıklanır.
* New Test ekranında "TC18 - Deneme18" isimli senaryo seçilir.
* New Test ekranındaki Configuration butonuna basılır.
* New Test ekranında yeni teste "demotest3" ismi verilir.
* New Test ekranında "Chrome" browser type seçilir.
* New Test ekranındaki Save butonuna tıklanır.
* Title'ı "demotest3" olan testin olduğu kontrol edilir.
* Title'ı "demotest3" olan test silinir.

## TC405 - Başarılı test oluşturmanın kontrolü (run test)
tags: Regresyon, Test
* Login olunur.
* New Test ekranı açılır.
* New Test ekranında "Proje X" isimli proje seçilir.
* New Test ekranında "demo2.spec" isimli spec seçilir.
* New Test ekranında "deneme" isimli tag seçilir.
* New Test ekranındaki Select butonuna tıklanır.
* New Test ekranında "Select All / Remove" isimli senaryo seçilir.
* New Test ekranındaki Configuration butonuna basılır.
* New Test ekranında yeni teste "demotest4" ismi verilir.
* New Test ekranında Local/Remote switch'e basılır.
* New Test ekranında "Chrome" browser type seçilir.
* New Test ekranında Scheduling switch'ine tıklanır ve "minute" seçilir.
* New Test ekranındaki Run Test butonuna tıklanır.
* Title'ı "demotest4" olan testin olduğu kontrol edilir.
* Title'ı "demotest4" olan teste tıklanır.
//* Testin Status değerinin "WAITING" olduğu kontrol edilir.
//* Testin Status değerinin "PENDING" olduğu kontrol edilir.
* Testin Status değerinin "BUILDING" olduğu kontrol edilir.
* Title'ı "demotest4" olan test silinir.

## TC406 - Succes alan koşumun kontrolü
tags: Regresyon, Test
* Login olunur.
* New Test ekranı açılır.
* New Test ekranında "Proje X" isimli proje seçilir.
* New Test ekranında "demo7.spec" isimli spec seçilir.
* New Test ekranında "deneme7" isimli tag seçilir.
* New Test ekranındaki Select butonuna tıklanır.
* New Test ekranında "TC15 - Deneme15" isimli senaryo seçilir.
* New Test ekranındaki Configuration butonuna basılır.
* New Test ekranında yeni teste "demotest9" ismi verilir.
* New Test ekranında Local/Remote switch'e basılır.
* New Test ekranında "Chrome" browser type seçilir.
* New Test ekranındaki Run Test butonuna tıklanır.
* Title'ı "demotest9" olan testin olduğu kontrol edilir.
* Title'ı "demotest9" olan teste tıklanır.
//* Testin Status değerinin "WAITING" olduğu kontrol edilir.
//* Testin Status değerinin "PENDING" olduğu kontrol edilir.
//* Testin Status değerinin "BUILDING" olduğu kontrol edilir.
* Testin Status değerinin "SUCCESS" olduğu kontrol edilir.
* Success olan testin status kısmının ve test barının yeşil olduğu kontrol edilir.
* Title'ı "demotest9" olan test silinir.

## TC407 - Fail alan koşumun kontrolü
tags: Regresyon, Test
* Login olunur.
* New Test ekranı açılır.
* New Test ekranında "Proje X" isimli proje seçilir.
* New Test ekranında "demo2.spec" isimli spec seçilir.
* New Test ekranındaki Select butonuna tıklanır.
* New Test ekranında "TC5 - Deneme5" isimli senaryo seçilir.
* New Test ekranında "TC6 - Deneme6" isimli senaryo seçilir.
* New Test ekranındaki Configuration butonuna basılır.
* New Test ekranında yeni teste "demotest10" ismi verilir.
* New Test ekranında Local/Remote switch'e basılır.
* New Test ekranında "Chrome" browser type seçilir.
* New Test ekranındaki Run Test butonuna tıklanır.
* Title'ı "demotest10" olan testin olduğu kontrol edilir.
* Title'ı "demotest10" olan teste tıklanır.
//* Testin Status değerinin "WAITING" olduğu kontrol edilir.
//* Testin Status değerinin "PENDING" olduğu kontrol edilir.
//* Testin Status değerinin "BUILDING" olduğu kontrol edilir.
* Testin Status değerinin "FAILURE" olduğu kontrol edilir.
* Fail olan testin status kısmının ve test barının kırmızı olduğu kontrol edilir.
* Title'ı "demotest10" olan test silinir.

## TC408 - Error alan koşumun kontrolü
tags: Regresyon, Test
* Login olunur.
* New Test ekranı açılır.
* New Test ekranında "Proje X" isimli proje seçilir.
* New Test ekranında "demo8.spec" isimli spec seçilir.
* New Test ekranındaki Select butonuna tıklanır.
* New Test ekranında "TC16 - Deneme16" isimli senaryo seçilir.
* New Test ekranındaki Configuration butonuna basılır.
* New Test ekranında yeni teste "proj104demo" ismi verilir.
* New Test ekranında "Chrome" browser type seçilir.
* New Test ekranındaki Run Test butonuna tıklanır.
* Title'ı "proj104demo" olan testin olduğu kontrol edilir.
* Title'ı "proj104demo" olan teste tıklanır.
//* Testin Status değerinin "WAITING" olduğu kontrol edilir.
//* Testin Status değerinin "PENDING" olduğu kontrol edilir.
//* Testin Status değerinin "BUILDING" olduğu kontrol edilir.
* Testin Status değerinin "ERROR" olduğu kontrol edilir.
* Error olan testin status kısmının ve test barının kırmızı olduğu kontrol edilir.
* Title'ı "proj104demo" olan test silinir.

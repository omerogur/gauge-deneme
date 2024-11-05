package com.vrgsl.step;

import com.thoughtworks.gauge.Step;
import com.virgosol.qa.web.core.di.InjectionHelper;
import com.virgosol.qa.web.core.element.Element;
import com.virgosol.qa.web.core.helper.ElementHelper;
import com.virgosol.qa.web.core.helper.StoreHelper;
import com.virgosol.qa.web.core.wait.WaitingAction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.security.SecureRandom;
import java.util.List;

public class StepImpl {

    private final Logger logger = LoggerFactory.getLogger(StepImpl.class);

    @Inject
    Element element;

    @Inject
    WebDriver driver;
    @Inject
    WaitingAction waitingAction;

    ElementHelper elementHelper;
    StoreHelper storeHelper;

    public StepImpl() {
        InjectionHelper.getInstance().getFeather().injectFields(this);
        elementHelper = ElementHelper.getInstance();
        storeHelper = StoreHelper.INSTANCE;
    }

    @Step({"Project type olarak <text> seçilir.",
            "Choose <text> as project type"})
    public void chooseProjectType(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[.='"+ value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Framework type olarak <text> seçilir.",
            "Choose <text> as framework type"})
    public void chooseFrameworkType(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[@class='select__menu-list css-11unzgr']/div[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Preferenced repository olarak <text> seçilir.",
            "Choose <text> as preferenced repository"})
    public void choosePreferencedRepository(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[@class='select__menu-list css-11unzgr']/div[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Scm Project Branch olarak <text> seçilir.",
            "Choose <text> as Scm Project Branch"})
    public void chooseScmProjectBranch(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[@class='select__menu-list css-11unzgr']/div[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Preferenced Jenkins olarak <text> seçilir.",
            "Choose <text> as Preferenced Jenkins"})
    public void choosePreferencedJenkins(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[@class='select__menu-list css-11unzgr']/div[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Jenkins Project Name olarak <text> seçilir.",
            "Choose <text> as Jenkins Project Name"})
    public void chooseJenkinsProjectName(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[@class='select__menu-list css-11unzgr']/div[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Preferenced Klov olarak <text> seçilir.",
            "Choose <text> as Preferenced Klov"})
    public void choosePreferencedKlov(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[@class='select__menu-list css-11unzgr']/div[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }


    @Step({"Klov Project Name olarak <text> seçilir.",
            "Choose <text> as Klov Project Name"})
    public void chooseKlovProjectName(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[@class='select__menu-list css-11unzgr']/div[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }
    @Step({"New Test ekranında ismi <text> olan senaryoyu seç.",
            "Choose the scenario with the name <text> in New Test screen"})
    public void chooseNewTestScenario(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//span[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"New Test ekranında Scheduling için <text> seç.",
            "Choose Scheduling as <text> in New Test screen"})
    public void chooseScheduling(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[contains(@class, 'ant-select-item ant-select-item-option')]/div[.='"+value+"']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Title'ı <text> olan test var mı?",
            "Is there a project with the Title <text>?"})
    public void checkTestTitle(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[.='" + value + "']"));
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Title'ı <text> olan teste tıkla",
            "Click on the project with the Title <text>"})
    public void clickTestTitle(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[.='" + value + "']")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Title'ı <text> olan testin seçenekler butonuna tıkla",
            "Click on the project with the Title <text>"})
    public void clickTestOptions(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//div[./div[.='"+value+"']]/div[10]/div/div/button")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Title'ı <text> olan projenin seçenekler butonuna tıkla",
            "Click on the settings of the project with the Title <text>"})
    public void clickProjectOptions(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("((//div[./div/div/h5[.='" + value + "']]/div)[3]/div)[3]/div/button")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }
    @Step({"Title'ı <text> olan projenin change icon butonuna tıkla.",
            "Click on the change icon for the project with the Title <text>"})
    public void clickProjectChangeIcon(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("((//div[./div/div/h5[.='" + value + "']]/div)[1]/div)[2]/div")).click();
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Step({"Testin Status değerinin <text> olduğu kontrol edilir.",
            "Checking if the Status value of the Test is <text>."})
    public void checkTestStatus(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//span[contains(@class, 'MuiChip-label')]/span[.='"+value+"']"));
        }catch (Exception e){
            fail(e.getMessage());
        }
    }


    @Step({"Sayfadaki <key> butonuna tıkla",
            "Click on page buton <key>"})
    public void clickOnPageButton(String key) {
        try{
            element.findByPresenceKey(key).click();
        }catch (Exception e){
            fail("Element could not be clicked");
        }
    }


    @Step({"Title'ı <text> olan proje var mı?",
            "Is there a project with the Title <text>?"})
    public void checkProjectTitle(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//h5[.='" + value + "']"));
        }catch (Exception e){
            fail("Element could not be found");
        }
    }

    @Step({"Title'ı <text> olan projeye tıkla",
            "Click on the project with the Title <text>"})
    public void clickProjectTitle(String text) {
        try{
            String value;
            if (text.startsWith("Data_")) {
                value = StoreHelper.INSTANCE.getValue(text);
            } else {
                value = text;
            }
            this.element.find(By.xpath("//h5[.='" + value + "']")).click();
        }catch (Exception e){
            fail("Element could not be found");
        }
    }

    @Step({"<key> li elementin <attr> attribute'ı <attrtext> içeriyor mu?",
            "find element <key> and check if <attr> contains <attrtext>?"})
    public void findElementWithTextAndCheckAttributeContainsText(String key, String attr, String attrtext) {
        try {
            if (!this.element.findByKey(key).isAttributeContains(attr, attrtext)){
                fail("Attribute does not contain the text");
            }
        } catch (Exception var5) {
            this.fail("It is not contain to attr text");
        }
    }

    @Step({"<key> li elementlerden random bir değere tıkla",
            "find elements <key> click on one random value"})
    public void randomClick(String key) {
        SecureRandom rand = new SecureRandom();
        List<WebElement> myList = this.element.findElements(this.elementHelper.getElementInfoToBy(key));
        int list_size = myList.size();
        int random_index = rand.nextInt(list_size);
        myList.get(random_index).click();
    }

    public void fail(String message){
        Assert.fail(message);
    }

}


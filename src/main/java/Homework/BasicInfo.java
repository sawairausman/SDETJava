package Homework;

public class BasicInfo {

   protected String name;
    protected String mobileNum;

    BasicInfo(String name, String mobileNum){

        this.name = name;
        this.mobileNum=mobileNum;

    }
    void displayBasicInfo(){
        System.out.print(name+" "+mobileNum+" ");
    }

}

class UserInfo extends BasicInfo {

    String userAddress;
    UserInfo(String name, String mobileNum,String userAddress){
        super(name, mobileNum);
        this.userAddress = userAddress;


    }
    public void userDetail(){
        super.displayBasicInfo();
        System.out.print(userAddress);
    }



}

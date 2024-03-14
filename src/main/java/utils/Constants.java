package utils;
//this class will give paths of different files, we can resuse this information
// the waits for how many second you want to stop your code
//all this information will be stored inside the file
//later on we can change the path and chage it in only constant class

//System.getProperty when we share the project with other when we are hardcoding somehing inour
//when others are going to clone the projec. they're not going to use it same.
//we want to write generic code. and not make modification.
public class Constants {
    public static final String CONFIG_FILE_PATH=System.getProperty("user.dir")+"\\Files\\Config.properties";
    public static final String EXCEL_FILE_PATH=System.getProperty("user.dir")+"\\Files\\Batch18.xlsx";

    public static final String FB_FIlE_PATH=System.getProperty("user.dir")+"\\Files\\fb.properties";



}
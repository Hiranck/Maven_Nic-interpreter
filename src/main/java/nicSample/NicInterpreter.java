/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nicSample;
import org.joda.time.DateTime;
/**
 *
 * @author HIRAN
 */
public class NicInterpreter {
    private int year = 0;
    private int month = 0;
    private int date = 0;
    private String gender;
    private boolean isVoter;
    private int recordSetNumber = 5;
    int check = 0;
    public NicId createNicId(String id)throws InvalidNicPropException {
        if((id.length()) != 10){
            throw new InvalidNicPropException();
        }
        if((id.charAt(9) != 'v') && (id.charAt(9) != 'V')){
            throw new InvalidNicPropException();
        }
        //create nic id object
        
        try {
            
            return new NicId(id.substring(0, 9), id.substring(9));
	} catch(Exception ex) {
            throw new InvalidNicPropException();
	}
    }
    public void interprete(NicId tempId)throws InvalidNicPropException{
        try{
            //get first 2 letters to calculate year
            year = Integer.parseInt(tempId.getNicId().substring(0, 2)) + 1900;
            
            
            //get current system date to check nic number is valid and to see whether he is vater
            DateTime sysDate = new DateTime();
            
           
            if(sysDate.getYear() - year >= 16){
                if(sysDate.getYear() - year > 18){
                    isVoter = true;
                }else{
                    isVoter = false;
                }
                //get the days of year
                int days = Integer.parseInt(tempId.getNicId().substring(2,5));
                if (days >= 500){
                    gender = "FEMALE";
                    days -= 500;
                }else{
                    gender = "MALE";
                }
                //create new date time object
                DateTime birthday = new DateTime(year, 1, 1, 0, 0);
                birthday = birthday.plusDays(days-2);
                //if days beyond 365 days
                if (year != birthday.getYear()) {
                    throw new InvalidNicPropException();
                }
                month = birthday.getMonthOfYear();
                date = birthday.getDayOfMonth();
            }else{
                throw new InvalidNicPropException();
            }
            
        }catch(Exception e){
            throw new InvalidNicPropException();
        }
    }
    @Override
    public String toString(){
        return "Nic [birthDay=BirthDay [year="+year +", month="+month+", date="+date+"], gender="+gender+", isVoter="+isVoter+", recordSetNumber="+recordSetNumber+"]";
        
    }
}

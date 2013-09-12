/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nicSample;

/**
 *
 * @author HIRAN
 */
public class NicInterpreter {
    private int year = 0;
    private int month = 0;
    private int date = 0;
    private String gender;
    private String isVoter;
    private int recordSetNummber;
    public NicId createNicId(String id)throws InvalidNicPropException {
        try {
            return new NicId(id.substring(0, 8), id.substring(8));
	} catch(Exception ex) {
            throw new InvalidNicPropException();
	}
    }
    public void interprete(NicId tempId)throws InvalidNicPropException{
        try{
             
            
        }catch(Exception e){
            throw new InvalidNicPropException();
        }
    }
}

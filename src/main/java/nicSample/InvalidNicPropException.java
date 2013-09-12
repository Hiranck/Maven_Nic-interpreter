/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nicSample;

/**
 *
 * @author HIRAN
 */
public class InvalidNicPropException extends Exception{
    

	public InvalidNicPropException() {
		super("invalid NIC ID entered...please check...!!!!");
	}
}

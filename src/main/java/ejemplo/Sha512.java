package ejemplo;

import javax.enterprise.inject.Alternative;

import org.apache.commons.codec.digest.DigestUtils;

@Alternative
public class Sha512 implements AlgoritmoHash {

	public String codificar(String texto) {
		return DigestUtils.sha512Hex(texto);
	}
	
}

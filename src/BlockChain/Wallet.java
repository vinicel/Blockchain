package BlockChain;
import java.security.*;

public class Wallet {

	public PrivateKey privateKey;
	public PublicKey publicKey;
	
	public Wallet() {
		generateKeyPair();
	}

	private void generateKeyPair() {
		// TODO Auto-generated method stub
		try {
			KeyPairGenerator KeyGen = KeyPairGenerator.getInstance("ECDSA","BC");
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			ECGenParameterSpec ecSpec = new ECGenParameterSpec("prime192v1");
			keyGen.initialize(ecSpec, random);
			KeyPair keyPair = keyGen.generateKeyPair();
			privateKey = keyPair.getPrivate();
			publicKey = keyPair.getPublic();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

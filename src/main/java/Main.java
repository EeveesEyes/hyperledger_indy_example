import org.hyperledger.indy.sdk.pool.Pool;
import org.hyperledger.indy.sdk.wallet.Wallet;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) throws Exception {
		try {
		Pool.deletePoolLedgerConfig("default_pool").get();
		} catch (Exception e){}

		// Anoncreds.demo();
		AnoncredsRevocation.demo();
		Ledger.demo();
		Crypto.demo();
		Endorser.demo();
	}
}

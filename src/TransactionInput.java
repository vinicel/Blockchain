public class TransactionInput {
    public String transactionOutputId;
    public TransactionOutput UTXD;

    public TransactionInput(String transactionOutputId) {
        this.transactionOutputId = transactionOutputId;
    }
}

package BlockchainComponents;

import Interfaces.*;
import Wallet.*;
import Block.*;
import java.util.*;
import Transaction.*;

public class MiningNode extends Node implements IMiningMethod {

    Integer balance;
    private List<Block> validatedBlocks = new ArrayList<>();

    public MiningNode(Wallet wallet, Integer balance) {
        super(wallet);
        this.balance = balance;
    }

    /*____________________________________________________________________*/
    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    
    public List<Block> getValidatedBlocks() {
        return this.validatedBlocks;
    }
    
    public void setValidatedBlocks(List<Block> validatedBlocks) {
        this.validatedBlocks = validatedBlocks;
    }
    
    public void addValidatedBlock(Block block) {
        this.validatedBlocks.add(block);
    }

    /*____________________________________________________________________*/
    @Override
    public void broadcast(IMessage msg) {
        msg.process(this);
    }

    @Override
    public String fullName() {
        return "MiningNode#" + this.formatId();
    }

    /*____________________________________________________________________*/
    
    /* TODO */
    @Override
    public String createHash(Block block) {
        return "";
    }
    
    /* TODO */
    @Override
    public Block mineBlock(Transaction transaction, Block previousConfirmedBlock, String minerKey) {
        return null;
    }
    
    /*____________________________________________________________________*/
}
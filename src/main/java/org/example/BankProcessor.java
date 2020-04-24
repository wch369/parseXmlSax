package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BankProcessor {

    public void process(Bank bank) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\learn\\output.sql", true));
        bw.write(
                String.format("insert into t_union_bank values ("
                        + "'%s',"
                        + "'%s',"
                        + "'%s',"
                        + "'%s');\n",
                        bank.getBankcode(),
                        bank.getBankname(),
                        bank.getCcpc(),
                        bank.getDreccode())
        );
        bw.flush();
        bw.close();
    }
}

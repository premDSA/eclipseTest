import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class MyMain {

	public static void main(String[] args) {
//		System.out.println("prem");
		double a =  (int) 5 - (double) 6;
		System.out.println((double) 25 - (int) 5 - (double) 6);
		
	}

    static Stream<PendingTransaction> reconcile(Stream<PendingTransaction> pending, Stream<Stream<ProcessedTransaction>> processed) {
//    	pending.filter(Objects::nonNull);
    	return pending.filter(p->isProcessed(p,processed)==true);
    }

	private static boolean isProcessed(PendingTransaction p,Stream<Stream<ProcessedTransaction>> processed) {
		// TODO Auto-generated method stub
		return processed.anyMatch(a->a.anyMatch(eachProsT-> Long.parseLong(eachProsT.getId()) == p.getId()));
	}
	
}

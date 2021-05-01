package report;

public class CE3 {

	public static void main(String[] args) {
		int R1,R2,Re,Rc;
	
	
		for(R1=1;R1<30000;R1+=10)
			for(R2=1;R2<30000;R2+=10)
				for(Rc=1;Rc<30000;Rc+=10)
					for(Re=1;Re<30000;Re+=10) {
						int Re2=Re/2;
						int Re1=Re2;
						double Rintot=1/(
								(1/R1)+(1/R2)+(1/
										(175*(
												(25*Re1+25*Re2)/10*(R2/R1+R2)-0.7
												)+Re1)
										)
								);
						
						double Av=(Rintot/(600+Rintot))*((47000*Rc)/(Re1*(Rc+47000)));
						
						if(Av>=14||Av<=16)
							System.out.println("일루미나티");
							
					}
						
						
		
		// TODO Auto-generated method stub

	}

}

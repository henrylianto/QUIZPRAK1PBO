import java.util.Scanner;

public class quizprak1{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int total,bayar=0,harga = 0; 
		int M,m,K,k,L,l = 0;
		int kembalian,banyak;
		char merek,tipe;
		String nama;
		boolean loop = true;
		
			
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		
	    System.out.println("Merk :      Tipe  :      Harga ");
		System.out.println("G           Meja(M)      Rp.  95.000 ");
		System.out.println("            Kursi(K)     Rp. 125.000 ");
		System.out.println("            Lemari(L)    Rp. 450.000 ");
		System.out.println();
		System.out.println("O           Meja(M)      Rp. 115.000 ");
		System.out.println("            Kursi(K)     Rp. 135.000 ");
		System.out.println("            Lemari(L)    Rp. 550.000 ");
		
		System.out.print("Masukkan Merek : ");
		merek = input.next().charAt(0);
		while(loop){
		System.out.print("Masukkan tipe : ");
		
        tipe = input.next().charAt(0);
		

		 switch(tipe)
		 {
		 	case 'm' :
            case 'M' :
               if (merek =='G' ||merek =='g' )
               {harga = 95000;
               }
               else {harga = 115000;
               }
                loop = false;
                break;
          
           case 'k' :     
           case 'K' :
               if (merek =='G' ||merek =='g') 
               {harga = 125000;
               }
               else {harga = 135000;
               }
                loop = false;
                break;

	 	   case 'l' :
           case 'L' :
               if (merek =='G' ||merek =='g') 
               {harga = 450000;
               }
               else {harga = 550000;
               }
                loop = false;
                break;

               default :
                System.out.println("Pilihan tidak tersedia, mohon input ulang");
               
                
        }
        
	  
	}
	
       System.out.print("Masukkan Banyak Pesanan : ");
       banyak = input.nextInt();
       total = banyak*harga;
       System.out.println("Total Harga   : Rp. "+total);
      
       
		while(bayar<total){
		System.out.print("Jumlah Bayaran : Rp."); 
		bayar = input.nextInt();
			if (bayar > total){
				kembalian=bayar-total;
			}
			else if (bayar<total){
				System.out.println("Uang anda kurang, mohon ditambah");
			}
		}
	   
	   kembalian = bayar - total;
		
		
		
	   System.out.println("Nama        : "+nama );
	   System.out.println("Total Harga : Rp."+total);
	   System.out.println("Bayar       : Rp."+bayar);
	   System.out.println("Kembalian   : Rp."+kembalian);
	    
	   
	    	
		
				
	}
}
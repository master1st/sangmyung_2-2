class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Goods(String name, int price, int numberOfStock)
	{
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		
	}
	String returname()
	{
		return this.name;
	}
	void soldinit()
	{
		this.sold = 0;
	}
	void SoldProduct()
	{
		this.sold++;
		this.numberOfStock--;
	}
	int returnStock()
	{
		return this.numberOfStock;
	}
	void AddStock(int Stock)
	{
		this.numberOfStock += Stock;
	}
	int returnSold()
	{
		return this.sold;
	}
	int returnPrice()
	{
		return this.price;
	}
}

import java.util.Scanner;

public class superAPI {

	public static void main(String args[])
	{
		boolean check = false;
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("슈퍼에서 취급하는 상품의 개수를 입력하시오.>>>");
		count = sc.nextInt();
		Goods product[] = new Goods[count];
		for(int i =0; i<count;i++)
		{
			String name;
			int price;
			int numberOfStock;
			System.out.print((i+1)+"번째 상품의 이름, 가격, 재고량을 입력하세요.>>");
			name = sc.next();
			price = sc.nextInt();
			numberOfStock = sc.nextInt();
			product[i] = new Goods(name, price, numberOfStock);
		}
		while(true)
		{
			int condition;
			System.out.println("1)판매	2)구매	 3)조회 	4)종료");
			condition = sc.nextInt();
			if(condition == 1)
			{
			
				int total = 0;
				for(int k = 0; k < product.length;k++)
					product[k].soldinit();
				while(true)
				{
					int i = 1;
					int j = 0;
					int input;
					for(; j < count; i++, j++)
					{
						System.out.print(i+")"+product[j].returname()+"\t");
					}
					System.out.println(i+") 계산");
					input = sc.nextInt();
					if(input == i)
					{
						System.out.println("판매가격 총액 :"+total);
						int getmoney;
						System.out.print("받은 금액을 입력하시오.>>> ");
						getmoney = sc.nextInt();
						System.out.println("   ###\t영수증\t###   ");
						System.out.println("============================");
						for(int l = 0; l < count; l++)
						{
							if(product[l].returnSold() > 0)
								System.out.println(product[l].returname()+"\t"+product[l].returnPrice()+"X"+product[l].returnSold()+"\t" + (product[l].returnPrice()*product[l].returnSold()) );
						}
						System.out.println("============================");
						System.out.println("총액\t\t"+total);
						System.out.println("받은금액\t\t"+getmoney);
						System.out.println("============================");
						System.out.println("거스름돈\t\t"+(getmoney - total));
						break;
					}
					input--;
					product[input].SoldProduct();
					total += product[input].returnPrice();
				}
					
			}
			
			else if(condition == 2)
			{
				while(true)
				{
					int i = 1;
					int j = 0;
					int select;
					int Quantity;
					for(; j < count; i++, j++)
					{
					System.out.print(i+")"+product[j].returname()+"\t");
					}
					System.out.println(i+") 구매 종료");
					select = sc.nextInt();
					if(select != i)
					{
						System.out.print("구매 수량을 입력하세요.>>>");
						Quantity = sc.nextInt();
						select--;
						product[select].AddStock(Quantity);
						System.out.println("##"+product[select].returname()+"의 재고량이 "+product[select].returnStock()+"으로 증가 함.");
					}
					else
						break;	
				}
			}
			else if(condition == 3)
			{
				System.out.println(" ###\t 상품명\t재고량\t###");
			System.out.println("==============================");
				for(int i = 0; i < count; i++)
				{
					System.out.println("\t"+product[i].returname()+"\t"+product[i].retrnStock());
				}
			System.out.println("==============================");
			}
			else if(condition == 4)
				return;
			
		}
	}
}

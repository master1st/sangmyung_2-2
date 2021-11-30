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
		System.out.print("���ۿ��� ����ϴ� ��ǰ�� ������ �Է��Ͻÿ�.>>>");
		count = sc.nextInt();
		Goods product[] = new Goods[count];
		for(int i =0; i<count;i++)
		{
			String name;
			int price;
			int numberOfStock;
			System.out.print((i+1)+"��° ��ǰ�� �̸�, ����, ����� �Է��ϼ���.>>");
			name = sc.next();
			price = sc.nextInt();
			numberOfStock = sc.nextInt();
			product[i] = new Goods(name, price, numberOfStock);
		}
		while(true)
		{
			int condition;
			System.out.println("1)�Ǹ�	2)����	 3)��ȸ 	4)����");
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
					System.out.println(i+") ���");
					input = sc.nextInt();
					if(input == i)
					{
						System.out.println("�ǸŰ��� �Ѿ� :"+total);
						int getmoney;
						System.out.print("���� �ݾ��� �Է��Ͻÿ�.>>> ");
						getmoney = sc.nextInt();
						System.out.println("   ###\t������\t###   ");
						System.out.println("============================");
						for(int l = 0; l < count; l++)
						{
							if(product[l].returnSold() > 0)
								System.out.println(product[l].returname()+"\t"+product[l].returnPrice()+"X"+product[l].returnSold()+"\t" + (product[l].returnPrice()*product[l].returnSold()) );
						}
						System.out.println("============================");
						System.out.println("�Ѿ�\t\t"+total);
						System.out.println("�����ݾ�\t\t"+getmoney);
						System.out.println("============================");
						System.out.println("�Ž�����\t\t"+(getmoney - total));
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
					System.out.println(i+") ���� ����");
					select = sc.nextInt();
					if(select != i)
					{
						System.out.print("���� ������ �Է��ϼ���.>>>");
						Quantity = sc.nextInt();
						select--;
						product[select].AddStock(Quantity);
						System.out.println("##"+product[select].returname()+"�� ����� "+product[select].returnStock()+"���� ���� ��.");
					}
					else
						break;	
				}
			}
			else if(condition == 3)
			{
				System.out.println(" ###\t ��ǰ��\t���\t###");
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

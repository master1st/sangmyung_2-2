import java.util.Scanner;

class Goods {
	private String name;
	private int price;
	private int numberOfStock;
//	private int sold;
	
	public Goods() {};
	
	public Goods(String name, int price, int numberOfStock) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		
	}
	public void imformation() 
	{
		int sum = 0;
	}
	public String setName() 
	{
		return this.name;
	}
	public int setprice() 
	{
		return this.price;
	}

//	public int setsold() 
//	{
//		return this.sold;
//	}
	public void minusStock() 
	{
		this.numberOfStock--;
	}
	public int setStock() 
	{
		return this.numberOfStock;
	}
	public int getstock(int numberOfStock) {
		this.numberOfStock += numberOfStock;
		return this.numberOfStock;
	}
}


class people extends Goods
{
	
	private int number;
	private static int sumprice;
	private int Purchase;
	public people() {};
	
	public people(String name, int price, int numberOfStock) 
	{
		super(name,price,numberOfStock);
	}
	
	public people(int number, int sumprice) 
	{
		this.number = number;
		this.sumprice = sumprice;
	}
	public void Purchasemenu(int num, int length) {
		for(int i=0; i<num; i++) {
			System.out.print(i+1+") "+ this.setName()+"  ");
		}
		System.out.println(length+1+" )��������");
	}
	public static void getsumprice(int sumprice) 
	{
		people.sumprice = sumprice;
	}
	public static int setsumprice() 
	{
		return people.sumprice;
	}
	public void getpurchase(int Purchase) {
		this.Purchase = Purchase;
		System.out.println("## "+this.setName()+"�� ����� "+this.getstock(this.Purchase)+"���� ���� ��.");
	}
	public int setpurchase() {
		return this.Purchase;
	}
	public void getnumber() 
	{
		this.number += 1;
	}
	public int setnumber() 
	{
		return this.number;
	}
	public void init() 
	{
		this.number = 0;
	}
	public void totalstock() 
	{
		System.out.println("    "+this.setName() + "      "+ this.setStock());
	}
	public static void printf() 
	{
		System.out.println("===========================");
	}
	public static void receipt() 
	{
		System.out.println("###  ������  ###");
		people.printf();	
	}

}
public class GoodsArray {
	public static void main(String[] args) {
		int chooseNum =0; int soldSum =0; int cMoney =0;
		boolean start = true;
         Scanner s = new Scanner(System.in);
         System.out.print("���ۿ��� ����ϴ� ��ǰ�� ������ �Է��Ͻÿ�.>>>");
         int num = s.nextInt();
         people[] goodsArray = new people [num];
		for(int i=0; i<goodsArray.length; i++) {
			System.out.print(i+1+"��° ��ǰ�� �̸�, ����, ����� �Է��Ͻÿ�.>>>");
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			goodsArray[i] = new people(name, price, n);
		}
		while(start) {
			int goodsNum =0;
			System.out.println("1)�Ǹ�   2)����   3)��ȸ   4)����");
			System.out.print(">>>");
			chooseNum = s.nextInt();
			for(int i=0; i<num; i++) {
				goodsArray[i].init();
			}
			switch(chooseNum) {
			case 1 :
				while(goodsNum!=6) {
					for(int i=0; i<num; i++) {
						System.out.print(i+1+") "+ goodsArray[i].setName()+"  ");
					}
					System.out.println(goodsArray.length+1+" )���");
					System.out.print(">>>");
					goodsNum = s.nextInt();
					if(goodsNum == 6)break;
					goodsArray[goodsNum-1].minusStock();
					soldSum += goodsArray[goodsNum-1].setprice();
//					people.getsumprice(soldSum);
					goodsArray[goodsNum-1].getnumber();
				}
				System.out.println("�Ǹ� ���� �Ѿ� :"+soldSum);
				System.out.print("���� �ݾ��� �Է��Ͻÿ� >>>");
				cMoney = s.nextInt();
				people.receipt();
				for(int i=0; i<goodsArray.length; i++) {
					if(goodsArray[i].setnumber()>0) {
						System.out.println(goodsArray[i].setName()+"  "+goodsArray[i].setprice()+"x"+goodsArray[i].setnumber()+"  "+
					goodsArray[i].setnumber()*goodsArray[i].setprice());
				}
				}
				people.printf();
				int change = cMoney-soldSum;
				System.out.println("�Ѿ�          "+soldSum);
				System.out.println("�����ݾ�       "+cMoney);
				people.printf();
				System.out.println("�Ž�����       "+change);
				break;
				
				
			case 2 :
				while(goodsNum!=6) {
					for(int i=0; i<num; i++) {
						System.out.print(i+1+") "+ goodsArray[i].setName()+"  ");
					}
					System.out.println(goodsArray.length+1+" )��������");
				
					System.out.print(">>>");
					goodsNum = s.nextInt();
					if(goodsNum==6)break;
					System.out.print("���� ������ �Է��Ͻÿ� >>>");
					int c = s.nextInt();
					goodsArray[goodsNum-1].getpurchase(c);
				}
				break;
				
				
			case 3 : 
				System.out.println("### ��ǰ��   ��� ###");
				people.printf();
				for(int i=0; i<goodsArray.length; i++) {
					goodsArray[i].totalstock();	
					
				}
				people.printf();
				break;
			case 4 : 
				start = false;
				break;
			
			default :
				break;
		}
		
	}
	}
}
	



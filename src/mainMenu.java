import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class mainMenu extends Application{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		start sta = new start(arg0);
		sta.handle(null);
	}
	
}

class start implements EventHandler<ActionEvent>{
	public Stage stage =new Stage();
	
	public start(Stage stage){
		this.stage = stage;
	}
	@Override
	public void handle(ActionEvent arg01) {
		Stage arg0 = new Stage();
		// TODO Auto-generated method stub
		BorderPane backPane = new BorderPane();
		backPane.setStyle("-fx-background-image:url(�γ����/backPhoto.jfif)");
		
		Pane topPane = new Pane();
		Image topName = new Image("�γ����/name.PNG");
		ImageView gameName = new ImageView(topName);
		topPane.getChildren().add(gameName);
		
		Image left = new Image("�γ����/ͼƬ1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		Image right = new Image("�γ����/ͼƬ2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		
		Image botton = new Image("�γ����/ͼƬ4_��ͼ��.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		HBox bottomPane = new HBox(bottonPhoto);
		bottomPane.setPadding(new Insets(100, 0, 0, 250));
		
		
		VBox centerPane = new VBox(100);
		
		Image startGame1 = new Image("�γ����/�ؿ�ģʽ_��ͼ��.png",130,130,true,true);
		ImageView startPhoto1 = new ImageView(startGame1);
		Button start1 = new Button("",startPhoto1);
		centerPane.setPadding(new Insets(20, 0, 0, 60));
	
		
		
		Image startGame2 = new Image("�γ����/��ϰģʽ_��ͼ��.png",130,130,true,true);
		ImageView startPhoto2 = new ImageView(startGame2);
		Button start2 = new Button("",startPhoto2);
		centerPane.setPadding(new Insets(0, 0, 0, 60));
		
		
		centerPane.getChildren().add(start1);
		centerPane.getChildren().add(start2);
		
		
		backPane.setTop(topPane);
		backPane.setLeft(leftPhoto);
		backPane.setRight(rightPhoto);
		backPane.setBottom(bottomPane);
		backPane.setCenter(centerPane);
		Scene scene = new Scene(backPane);
		
		arg0.setScene(scene);
		arg0.setHeight(500);
		arg0.setWidth(570);
		arg0.setResizable(false);
		arg0.setTitle("����");
		arg0.show();
		
		//����ؿ�ģʽ�л����ؿ���Ϸģʽ
		startGame hander1 = new startGame(arg0);
		start1.setOnAction(hander1);
		//����л�����ϰģʽ
		practiceGame hander2 = new practiceGame(arg0);
		start2.setOnAction(hander2);
		
		this.stage.close();
	}
	
}




//�����ѡ��������ϰģʽ
class practiceGame implements EventHandler<ActionEvent>{
	public Stage stage =new Stage();
	
	public practiceGame(Stage stage){
		this.stage = stage;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Stage gameMenu = new Stage();
		
		BorderPane backPane = new BorderPane();
		backPane.setStyle("-fx-background-image:url(�γ����/backPhoto.jfif)");
		
		Pane topPane = new Pane();
		Image topName = new Image("�γ����/name.PNG");
		ImageView gameName = new ImageView(topName);
		topPane.getChildren().add(gameName);
		
		Image left = new Image("�γ����/ͼƬ1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		Image right = new Image("�γ����/ͼƬ2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		
		Image botton = new Image("�γ����/ͼƬ4_��ͼ��.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		HBox bottomPane = new HBox(bottonPhoto);
		bottomPane.setPadding(new Insets(100, 0, 0, 250));
		
		
		VBox centerPane = new VBox(100);
		
		Image startGame1 = new Image("�γ����/����ͼ��_��ͼ��.png",130,130,true,true);
		ImageView startPhoto1 = new ImageView(startGame1);
		Button start1 = new Button("",startPhoto1);
		centerPane.setPadding(new Insets(20, 0, 0, 60));
	
		Image startGame2 = new Image("�γ����/����ͼ��_��ͼ��.png",130,130,true,true);
		ImageView startPhoto2 = new ImageView(startGame2);
		Button start2 = new Button("",startPhoto2);
		centerPane.setPadding(new Insets(0, 0, 0, 60));
		
		
		centerPane.getChildren().add(start1);
		centerPane.getChildren().add(start2);
		
		
		backPane.setTop(topPane);
		backPane.setLeft(leftPhoto);
		backPane.setRight(rightPhoto);
		backPane.setBottom(bottomPane);
		backPane.setCenter(centerPane);
		Scene scene = new Scene(backPane);
		
		
		gameMenu.setScene(scene);
		gameMenu.setHeight(500);
		gameMenu.setWidth(570);
		gameMenu.setResizable(false);
		gameMenu.setTitle("����");
		gameMenu.show();
		
		this.stage.close();
	
		
		formalMap map = new formalMap(gameMenu);
		start1.setOnAction(map);
	
		
		Special special = new Special(gameMenu);
		start2.setOnAction(special);
	}
}

//����ͼ��ģʽ
class formalMap implements EventHandler<ActionEvent>{
	//�ı���
	public TextField Xpos = new TextField();
	public TextField Ypos = new TextField();
	
	public BorderPane backPane = new BorderPane();
	public Stage stage =new Stage();
	public GridPane vbox = new GridPane();
	public  int [][] thisMap ;
	public ArrayList<String> Visited1;
	public Stack<String> Road1;
	public Rectangle [][] rectangles;
	public int [][] num ;
	int num1=0;
	public makeSpecicalMap makeSpecicalMap;
	public formalMap(Stage stage){
		this.stage = stage;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Stage simpleGame = new Stage();
		
		backPane.setStyle("-fx-background-image:url(�γ����/timg.jpg)");
		
		Image topName = new Image("�γ����/name.PNG");
		ImageView gameName = new ImageView(topName);
		
		
		Image left = new Image("�γ����/ͼƬ1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		Image right = new Image("�γ����/ͼƬ2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		
		Image botton = new Image("�γ����/ͼƬ4_��ͼ��.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		
		//����м���Ϸ����--------------------------------------------------------------------------------------------------
		GridPane hbox = new GridPane();
		
		ComboBox<Button> com = new ComboBox<Button>();
		com.setMinWidth(130);
		com.setMaxHeight(30);
		//com.setStyle("-fx-background-image:url(�γ����/�����Թ�_��ͼ��.PNG)");
		Image img1 = new Image("�γ����/�����Թ�_��ͼ��.PNG",130,130,true,true);
		Image img2 = new Image("�γ����/Ѱ��·��_��ͼ��.PNG",130,130,true,true);
		Image img3 = new Image("�γ����/�����Թ�_��ͼ��.PNG",130,130,true,true);
		Image img4 = new Image("�γ����/����Ѱ·_��ͼ��.PNG",130,130,true,true);
		Image img5 = new Image("�γ����/�����Թ�_��ͼ��.PNG",130,130,true,true);
		Image img6 = new Image("�γ����/ѡ���Թ�_��ͼ��.PNG",130,130,true,true);
		Image img7 = new Image("�γ����/�˳�_��ͼ��.PNG",100,30,true,true);
		
		
		ImageView imgView1 = new ImageView(img1);
		ImageView imgView2 = new ImageView(img2);
		ImageView imgView3 = new ImageView(img3);
		ImageView imgView4 = new ImageView(img4);
		ImageView imgView5 = new ImageView(img5);
		ImageView imgView6 = new ImageView(img6);
		ImageView imgView7 = new ImageView(img7);
		
		Button bt1 = new Button("",imgView1);
		
		Button bt2 = new Button("",imgView2);
		
		Button bt3 = new Button("",imgView3);
		
		Button bt4 = new Button("",imgView4);
		
		Button bt5 = new Button("",imgView5);
		
		Button bt6 = new Button("",imgView6);
		
		Button bt7 = new Button("",imgView7);
		
		
		
		Button bt11 = new Button("prim");
		Button bt12 = new Button("�ݹ��и�");
		
		com.getItems().add(bt11);
		com.getItems().add(bt12);
		
		
		
		//HBox hbox = new HBox(15);
		//hbox.setAlignment(Pos.CENTER);
		//��button�ŵ�center�ĵ����
		hbox.addRow(0,bt1, bt2, bt3, bt4, bt5,bt6,bt7);
		hbox.setAlignment(Pos.CENTER);
		
	//����м���Ϸ����--------------------------------------------------------------------------------------------------
		
		//���
		VBox setXPos = new VBox();
		
		Xpos.setEditable(true);//�ɱ༭
		
		Image heightName = new Image("�γ����/�߶�_��ͼ��.PNG");
		ImageView hName = new ImageView(heightName);
		
		
		setXPos.getChildren().add(hName);
		setXPos.getChildren().add(Xpos);
		setXPos.getChildren().add(leftPhoto);
		setXPos.setAlignment(Pos.CENTER);
		
		//�Ҳ�
		VBox setYPos = new VBox();
		Ypos.setEditable(true);//�ɱ༭
		Image widthName = new Image("�γ����/���_��ͼ��.PNG");
		ImageView wName = new ImageView(widthName);
		
		setYPos.getChildren().add(wName);
		setYPos.getChildren().add(Ypos);
		setYPos.getChildren().add(rightPhoto);
		setYPos.setAlignment(Pos.CENTER);
		
		
		
		
		BorderPane.setAlignment(bottonPhoto, Pos.CENTER);
		//BorderPane.setAlignment(rightPhoto, Pos.CENTER);
		//BorderPane.setAlignment(setXPos, Pos.CENTER);
		BorderPane.setAlignment(gameName, Pos.CENTER);
		BorderPane.setAlignment(hbox, Pos.CENTER);
		
		backPane.setTop(hbox);
		backPane.setLeft(setXPos);
		backPane.setRight(setYPos);
		backPane.setBottom(bottonPhoto);
		//backPane.setCenter(hbox);
		backPane.setCenter(vbox);
		
		//center
		
		
	//---------------------------------------------------------------------------------------------------------------------	
		//getHeiAndWid();
		
		Scene scene = new Scene(backPane);
		simpleGame.setScene(scene);
		simpleGame.setHeight(800);
		simpleGame.setWidth(1300);
		simpleGame.setResizable(false);
		simpleGame.setTitle("����ģʽ");
		simpleGame.show();
		this.stage.close();
		
	//�¼�����
		//���buttom1 �����ɵ�ͼ
		bt1.setOnAction(e->{
			//���ʹ��prim�͵ݹ��и��㷨
			Random ran = new Random();
			int m = 1+ran.nextInt(2);
			getHeiAndWid(m);
			});
		//bt12.setOnAction(e->getHeiAndWid(2));
		bt5.setOnAction(e->reflesh(simpleGame));
		bt2.setOnAction(e->findMin());
		//---------------------------------------
		
		
		bt4.setOnAction(e->{
			if(num1==0) {
				Visited1 = new ArrayList<String>();
				Road1 = new Stack<String>();
				Road1.push(1+","+1);
				Visited1.add(1+","+1);
				num1=1;
			}
			StapFindRoad();
			});
		//formalMap map = new formalMap(gameMenu);
		
		start newstart = new start(simpleGame);
		bt7.setOnAction(e->newstart.handle(null));
	//	returnMap map = new returnMap(this.stage);
		bt3.setOnAction(e->{
				Traverse ();
		});
		
		bt6.setOnAction(e->{
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open a text file!");
		fileChooser.setInitialDirectory(new File("D:\\�½��ļ���\\bin\\�γ����"));
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(simpleGame);
        System.out.println(file);
        IOopen iOopen =new IOopen(file);
        makemap(iOopen);
		});
	}	
	
	
	
	
	//�����Թ�(�ڲ���+���߳�)
	public void traverse() {
		Visited1 = new ArrayList<String>();
		Road1 = new Stack<String>();
		Road1.push(1+","+1);
		Visited1.add(1+","+1);
		
		while(!Road1.isEmpty()) {
				String[] newcoord =new String[2];
				
				int x;
				int y;
			
				
				if(Road1.isEmpty())
					break;
			/*for(int i=0;i<thisMap.length;i++) {
				for(int j=0;j<thisMap[0].length;j++) {
					System.out.print(thisMap[i][j]+" ");
				}
				System.out.println("");
			}*/
			//System.out.println((thisMap.length-2)+","+(thisMap[0].length-2));
				String[] newcoord1 =new String[2];
				newcoord1=Road1.peek().split(",", 2);
				
				int x1 = Integer.parseInt(newcoord1[0]);
				int y1 = Integer.parseInt(newcoord1[1]);
			double len = (500/(thisMap.length)) > (500/(thisMap[0].length)) ? (500/(thisMap.length)) : (500/(thisMap[0].length));
			if(!Road1.isEmpty()) {
				
				//��������յ������Χû·�ˣ��ͳ�ջ���˻���һ������
				if(Road1.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))||(!findAround(Road1.peek(),Visited1)
						&&(num[x1][y1]+1>=num[x1-1][y1]
						&&num[x1][y1]+1>=num[x1][y1-1]
						&&num[x1][y1]+1>=num[x1][y1+1]
						&&num[x1][y1]+1>=num[x1+1][y1]))) {
					if(!findAround(Road1.peek(),Visited1)&&!Road1.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))&&!Road1.peek().equals(1+","+1)) {
					newcoord=Road1.peek().split(",", 2);
					x = Integer.parseInt(newcoord[0]);
					y = Integer.parseInt(newcoord[1]);
					}
					Road1.pop();
				}
			
				
				//������Χ�����꣬���ѡȡһ��δ��Visited�����꣬��ջ
				if(Road1.peek()!=((thisMap.length-2)+","+(thisMap[0].length-2))&&(findAround(Road1.peek(),Visited1)
								||num[x1][y1]+1<num[x1-1][y1]
								||num[x1][y1]+1<num[x1][y1-1]
								||num[x1][y1]+1<num[x1][y1+1]
								||num[x1][y1]+1<num[x1+1][y1])) {
					newcoord=Road1.peek().split(",", 2);
					
					 x = Integer.parseInt(newcoord[0]);
					 y = Integer.parseInt(newcoord[1]);
					 
					 
					 
					//���ȱ����ұ�
					if(thisMap[x][y+1]!=0&&(!Visited1.contains((x)+","+(y+1))||num[x][y]+1<num[x][y+1])) {
						Visited1.add(x+","+(y+1));
						Road1.push(x+","+(y+1));
						num[x][y+1]=num[x][y]+1;
						if((x!=(thisMap.length-2)||(y+1)!=(thisMap[0].length-2))&&(x!=1||(y+1)!=1)) {
						}
						continue;
					}
					//����
					if(thisMap[x+1][y]!=0&&(!Visited1.contains((x+1)+","+(y))||num[x][y]+1<num[x+1][y])) {
						num[x+1][y]=num[x][y]+1;
						Visited1.add((x+1)+","+y);
						Road1.push((x+1)+","+y);
						if(((x+1)!=(thisMap.length-2)||(y)!=(thisMap[0].length-2))&&((x+1)!=1||(y)!=1)) {
						}
						continue;
					}
					
					//���
					if(thisMap[x][y-1]!=0&&(!Visited1.contains((x)+","+(y-1))||num[x][y]+1<num[x][y-1])) {
						num[x][y-1]=num[x][y]+1;
						Visited1.add(x+","+(y-1));
						Road1.push(x+","+(y-1));
						if((x!=(thisMap.length-2)||(y-1)!=(thisMap[0].length-2))&&(x!=1||(y-1)!=1)) {
						}
						continue;
					}
					
					//����
					if(thisMap[x-1][y]!=0&&(!Visited1.contains((x-1)+","+(y))||num[x][y]+1<num[x-1][y])) {
						num[x-1][y]=num[x][y]+1;
						Visited1.add((x-1)+","+y);
						Road1.push((x-1)+","+y);
						if(((x-1)!=(thisMap.length-2)||(y)!=(thisMap[0].length-2))&&((x-1)!=1||(y)!=1)) {
						}
						continue;
					}
					
				}
				
			}
		}
		System.out.println("��������");
//		Image map ;
//		ImageView mapPhoto2;
//		double len = (500/(thisMap.length)) > (500/(thisMap[0].length)) ? (500/(thisMap.length)) : (500/(thisMap[0].length));
//
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				if(num[i][j]!=0) {
//					map = new Image("�γ����/1.PNG",len,len,true,true);
//					mapPhoto2 = new ImageView(map);
//					vbox.add( mapPhoto2, j, i);
//				}
//					
//			}
//		}
		
		
		//��������
		
	
	}
	


	public void Traverse() {
		Image map ;
		ImageView mapPhoto2;
		double len = (500/(thisMap.length)) > (500/(thisMap[0].length)) ? (500/(thisMap.length)) : (500/(thisMap[0].length));

		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(thisMap[i][j]!=0) {
					map = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
					mapPhoto2 = new ImageView(map);
					vbox.add( mapPhoto2, j, i);
					}
				}
			}
	}	
	
	
	
	
	//����Ѱ·
	public void StapFindRoad() {
	
		//ArrayList<Stack<String>> findRoad = new ArrayList<Stack<String>>(); 
	
		
		Image map ;
		ImageView mapPhoto2;
			String[] newcoord =new String[2];
			
			int x;
			int y;
		
			
			if(Road1.isEmpty())
				return;
		/*for(int i=0;i<thisMap.length;i++) {
			for(int j=0;j<thisMap[0].length;j++) {
				System.out.print(thisMap[i][j]+" ");
			}
			System.out.println("");
		}*/
		//System.out.println((thisMap.length-2)+","+(thisMap[0].length-2));
			String[] newcoord1 =new String[2];
			newcoord1=Road1.peek().split(",", 2);
			
			int x1 = Integer.parseInt(newcoord1[0]);
			int y1 = Integer.parseInt(newcoord1[1]);
		double len = (500/(thisMap.length)) > (500/(thisMap[0].length)) ? (500/(thisMap.length)) : (500/(thisMap[0].length));
		if(!Road1.isEmpty()) {
			
			//��������յ������Χû·�ˣ��ͳ�ջ���˻���һ������
			if(Road1.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))||(!findAround(Road1.peek(),Visited1)
					&&(num[x1][y1]+1>=num[x1-1][y1]
					&&num[x1][y1]+1>=num[x1][y1-1]
					&&num[x1][y1]+1>=num[x1][y1+1]
					&&num[x1][y1]+1>=num[x1+1][y1]))) {
				if(!findAround(Road1.peek(),Visited1)&&!Road1.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))&&!Road1.peek().equals(1+","+1)) {
				newcoord=Road1.peek().split(",", 2);
				x = Integer.parseInt(newcoord[0]);
				y = Integer.parseInt(newcoord[1]);
				map = new Image("�γ����/1.PNG",len,len,true,true);
				mapPhoto2 = new ImageView(map);
				vbox.add( mapPhoto2, y, x);
				}
				Road1.pop();
			}
		
			
			//������Χ�����꣬���ѡȡһ��δ��Visited�����꣬��ջ
			if(Road1.peek()!=((thisMap.length-2)+","+(thisMap[0].length-2))&&(findAround(Road1.peek(),Visited1)
							||num[x1][y1]+1<num[x1-1][y1]
							||num[x1][y1]+1<num[x1][y1-1]
							||num[x1][y1]+1<num[x1][y1+1]
							||num[x1][y1]+1<num[x1+1][y1])) {
				newcoord=Road1.peek().split(",", 2);
				
				 x = Integer.parseInt(newcoord[0]);
				 y = Integer.parseInt(newcoord[1]);
				 
				 
				 
				//���ȱ����ұ�
				if(thisMap[x][y+1]!=0&&(!Visited1.contains((x)+","+(y+1))||num[x][y]+1<num[x][y+1])) {
					Visited1.add(x+","+(y+1));
					Road1.push(x+","+(y+1));
					num[x][y+1]=num[x][y]+1;
					if((x!=(thisMap.length-2)||(y+1)!=(thisMap[0].length-2))&&(x!=1||(y+1)!=1)) {
					map = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
					mapPhoto2 = new ImageView(map);
					vbox.add( mapPhoto2, y+1, x);
					}
					return;
				}
				//����
				if(thisMap[x+1][y]!=0&&(!Visited1.contains((x+1)+","+(y))||num[x][y]+1<num[x+1][y])) {
					num[x+1][y]=num[x][y]+1;
					Visited1.add((x+1)+","+y);
					Road1.push((x+1)+","+y);
					if(((x+1)!=(thisMap.length-2)||(y)!=(thisMap[0].length-2))&&((x+1)!=1||(y)!=1)) {
					map = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
					mapPhoto2 = new ImageView(map);
					vbox.add( mapPhoto2, y, x+1);
					}
					return;
				}
				
				//���
				if(thisMap[x][y-1]!=0&&(!Visited1.contains((x)+","+(y-1))||num[x][y]+1<num[x][y-1])) {
					num[x][y-1]=num[x][y]+1;
					Visited1.add(x+","+(y-1));
					Road1.push(x+","+(y-1));
					if((x!=(thisMap.length-2)||(y-1)!=(thisMap[0].length-2))&&(x!=1||(y-1)!=1)) {
					map = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
					mapPhoto2= new ImageView(map);
					vbox.add( mapPhoto2, y-1, x);
					}
					return;
				}
				
				//����
				if(thisMap[x-1][y]!=0&&(!Visited1.contains((x-1)+","+(y))||num[x][y]+1<num[x-1][y])) {
					num[x-1][y]=num[x][y]+1;
					Visited1.add((x-1)+","+y);
					Road1.push((x-1)+","+y);
					if(((x-1)!=(thisMap.length-2)||(y)!=(thisMap[0].length-2))&&((x-1)!=1||(y)!=1)) {
					map = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
					mapPhoto2= new ImageView(map);
					vbox.add( mapPhoto2, y, x-1);
					}
					return;
				}
				
			}
			
		}
	}
	
	
	
	
	
	
	//ÿ��һ��Ȩֵ��֮ǰ������һ��Ѱ��ջ��Ԫ�ص���һ���ɷ��ʵ����ڽ�㣬
	//��������ջ��Ԫ�ص�Ȩֵ��1����С����һ���ڵ��Ȩֵ������һ���ڵ�δ�����ʹ�
	//Ѱ�����·��(������ȱ����ӻ���)
	public void findMin() {
		
		
		//�洢ÿ������Ȩֵ
		int [][] num =new int [thisMap.length][thisMap[0].length];
		for(int i=0;i<thisMap.length;i++) {
			for(int j=0;j<thisMap[0].length;j++) {
				num[i][j]=0;
			}
		}
		
		ArrayList<String> Visited = new ArrayList<String>();
		Stack<String> Road = new Stack<String>();
		
		ArrayList<Stack<String>> findRoad = new ArrayList<Stack<String>>(); 
		
		Road.push(1+","+1);
	
		Visited.add(1+","+1);
		
		
		/*for(int i=0;i<thisMap.length;i++) {
			for(int j=0;j<thisMap[0].length;j++) {
				System.out.print(thisMap[i][j]+" ");
			}
			System.out.println("");
		}*/
		//System.out.println((thisMap.length-2)+","+(thisMap[0].length-2));
		Stack<String> stack;
		while(!Road.isEmpty()) {
			//����Ѿ�������,��ջ��Ԫ�ش浽�浽�ɱ䳤����	
			String[] newcoord1 =new String[2];
			newcoord1=Road.peek().split(",", 2);
			
			int x1 = Integer.parseInt(newcoord1[0]);
			int y1 = Integer.parseInt(newcoord1[1]);
			
			if(Road.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))){
				stack= new Stack<String>();
				//��ȸ���
				for(int i=0;i<Road.size();i++) {
					stack.push(Road.get(i));
				}
				
				findRoad.add(stack);
			}
			//��������յ������Χû·�ˣ��ͳ�ջ���˻���һ������
			if(Road.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))||(!findAround(Road.peek(),Visited)
					&&(num[x1][y1]+1>=num[x1-1][y1]
							&&num[x1][y1]+1>=num[x1][y1-1]
							&&num[x1][y1]+1>=num[x1][y1+1]
							&&num[x1][y1]+1>=num[x1+1][y1]))) {
				Road.pop();
				continue;
			}
			//������Χ�����꣬���ѡȡһ��δ��Visited�����꣬��ջ
		
			
			while(Road.peek()!=((thisMap.length-2)+","+(thisMap[0].length-2))&&(findAround(Road.peek(),Visited)
					||num[x1][y1]+1<num[x1-1][y1]
					||num[x1][y1]+1<num[x1][y1-1]
					||num[x1][y1]+1<num[x1][y1+1]
					||num[x1][y1]+1<num[x1+1][y1])) {
				String[] newcoord =new String[2];
				newcoord=Road.peek().split(",", 2);
				
				int x = Integer.parseInt(newcoord[0]);
				int y = Integer.parseInt(newcoord[1]);
				//���ȱ����ұ�
				if(thisMap[x][y+1]!=0&&((!Visited.contains((x)+","+(y+1))||(num[x][y]+1<num[x][y+1]))||(x==(thisMap.length-2)&&(y+1)==(thisMap[0].length-2)))) {
					num[x][y+1]=num[x][y]+1;
					Visited.add(x+","+(y+1));
					Road.push(x+","+(y+1));
					break;
				}
				
				if(thisMap[x+1][y]!=0&&((!Visited.contains((x+1)+","+(y))||(num[x][y]+1<num[x+1][y]))||((x+1)==(thisMap.length-2)&&y==(thisMap[0].length-2)))) {
					num[x+1][y]=num[x][y]+1;
					Visited.add((x+1)+","+y);
					Road.push((x+1)+","+y);
					break;
				}
				
				if(thisMap[x][y-1]!=0&&((!Visited.contains((x)+","+(y-1))||(num[x][y]+1<num[x][y-1]))||(x==(thisMap.length-2)&&(y-1)==(thisMap[0].length-2)))) {
					num[x][y-1]=num[x][y]+1;
					Visited.add(x+","+(y-1));
					Road.push(x+","+(y-1));
					break;
				}
				
				if(thisMap[x-1][y]!=0&&((!Visited.contains((x-1)+","+(y))||(num[x][y]+1<num[x-1][y]))||((x-1)==(thisMap.length-2)&&y==(thisMap[0].length-2)))) {
					num[x-1][y]=num[x][y]+1;
					Visited.add((x-1)+","+y);
					Road.push((x-1)+","+y);
					break;
				}
			}
			
		}
		int max=0;
		//�ҳ����·��
		
		for(int i=0;i<findRoad.size();i++) {
			for(int j=0;j<findRoad.get(i).size();j++) {
				System.out.println(findRoad.get(i).get(j));
			}
			System.out.print("******");
		}
		
		for(int i=1;i<findRoad.size();i++) {
			if(findRoad.get(i).size()<findRoad.get(max).size()) {
				max=i;
			}
		}
		
		//������·��������
		String[] newcoord =new String[2];
		
		
		int x =0;
		int y =0;
		
			Image[][] map = new Image[thisMap.length+2][thisMap[0].length+2];
		 ImageView[][] mapPhoto = new ImageView[thisMap.length+2][thisMap[0].length+2];
			
			double len = (600/(thisMap.length)) > (600/(thisMap[0].length)) ? (600/(thisMap.length)) : (600/(thisMap[0].length));
			
		int [][] minRode = new int[2][findRoad.get(max).size()];
		
		
		for(int j=0;j<findRoad.get(max).size();j++) {
			System.out.println(findRoad.get(max).get(j));
		}
		
		
		for(int j=0;j<findRoad.get(max).size();j++) {
			newcoord=findRoad.get(max).get(j).split(",", 2);
			 x = Integer.parseInt(newcoord[0]);
			 y = Integer.parseInt(newcoord[1]);
			 
			 minRode[0][j]=x;
			 minRode[1][j]=y;
		}
		
		

	
		for(int i=1;i<minRode[0].length-1;i++) {
			//height���䣬width��һ   ����
			if(minRode[0][i]==minRode[0][i+1]&&minRode[1][i+1]==minRode[1][i]+1) {
				map[minRode[0][i]][minRode[1][i]] = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
				
			}
			//height���䣬width��һ  ����
			if(minRode[0][i]==minRode[0][i+1]&&minRode[1][i+1]==minRode[1][i]-1) {
				map[minRode[0][i]][minRode[1][i]] = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
				
			}
				
			//width���䣬height��һ ����
			if(minRode[1][i]==minRode[1][i+1]&&minRode[0][i+1]==minRode[0][i]+1) {
				map[minRode[0][i]][minRode[1][i]] = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
				
			}	
			//width���䣬height��һ  ����
			if(minRode[1][i]==minRode[1][i+1]&&minRode[0][i+1]==minRode[0][i]-1) {
				map[minRode[0][i]][minRode[1][i]] = new Image("�γ����/�����ӡ��.PNG",len,len,true,true);
				
			}
			 mapPhoto[minRode[0][i]][minRode[1][i]] = new ImageView(map[minRode[0][i]][minRode[1][i]]);
			 
			 vbox.add( mapPhoto[minRode[0][i]][minRode[1][i]], minRode[1][i], minRode[0][i]);
		}
		
		
	}
	//�ж�һ�����������Χ�Ƿ��Ѿ�ȫ������
	public boolean findAround(String str,ArrayList<String> array) {
		
		boolean isWallAll = false;
		
		int x1=0;
		int y1=0;
		
		//��X��Y��ֵ���ַ�������ȡ����
		
		String[] newcoord =new String[2];
		newcoord=str.split(",", 2);
		
		x1 = Integer.parseInt(newcoord[0]);
		y1 = Integer.parseInt(newcoord[1]);
		
		System.out.println("");
		System.out.println(x1+","+y1);
		if((thisMap[x1-1][y1]!=0&&!array.contains((x1-1)+","+y1))||(thisMap[x1][y1+1]!=0&&!array.contains((x1)+","+(y1+1)))||
				(thisMap[x1][y1-1]!=0&&!array.contains((x1)+","+(y1-1)))||(thisMap[x1+1][y1]!=0&&!array.contains((x1+1)+","+y1))) {
			isWallAll =true;
			}
		
		return isWallAll;
	}
	
	
	//�����Թ�
	public void reflesh(Stage stage) {
		vbox.getChildren().clear();
		Visited1.clear();
		Road1.clear();
		Visited1 = new ArrayList<String>();
		Road1 = new Stack<String>();
		Road1.push(1+","+1);
		Visited1.add(1+","+1);
		for(int i=0;i<thisMap.length;i++) {
			for(int j=0;j<thisMap[0].length;j++) {
				num[i][j]=0;
			}
		}
		
	}
	
	//�����Թ�(ͼƬ��ʽ)
	public void makemap(maze cutmap) {
		 Image[][] map = new Image[cutmap.returnMaze().length][cutmap.returnMaze().length];
			
			
			ImageView[][] mapPhoto = new ImageView[cutmap.returnMaze().length][cutmap.returnMaze().length];
			
			double len = 600/(cutmap.returnMaze().length);
			
			/*for(int i=0;i<cutmap.height+2;i++) {
				for(int j=0;j<cutmap.width+2;j++) {
					 rectangle[i][j] = new Rectangle(len, len);
					if(i==1&&j==1)
						rectangle[i][j].setFill(Color.AQUAMARINE);
					else if(i==cutmap.height&&j==cutmap.width) 
						rectangle[i][j].setFill(Color.CRIMSON);
				
						else if(cutmap.blocked[i][j]==0)
							rectangle[i][j].setFill(Color.BLACK);
						else if(cutmap.blocked[i][j]==1)
							rectangle[i][j].setFill(Color.GRAY);
					
							rectangle[i][j].setStroke(Color.WHITE);
				}
			}
			
			
			vbox.setAlignment(Pos.CENTER);
			
			for(int i=0;i<cutmap.height+2;i++) {
				for(int j=0;j<cutmap.width+2;j++) {
					vbox.add(rectangle[i][j], i, j);
				}
				}
			*/
			vbox.getChildren().clear();
			
			vbox.setAlignment(Pos.CENTER);
			 for(int i=0;i<cutmap.returnMaze().length;i++) {
				 for(int j=0;j<cutmap.returnMaze().length;j++) {
					 
					 System.out.print(cutmap.returnMaze()[i][j]+" ");
					 
					  if(cutmap.returnMaze()[i][j]==0) {
						 map[i][j] = new Image("�γ����/2.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					  if(cutmap.returnMaze()[i][j]==1) {
						 map[i][j] = new Image("�γ����/1.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					
					 if(i==1&&j==1) {
						 map[i][j] = new Image("�γ����/��ɫһ.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					 
					 if(i==cutmap.returnMaze().length-2&&j==cutmap.returnMaze().length-2) {
						 map[i][j] = new Image("�γ����/�յ�1.png",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }	 
				 }
				 System.out.println("");
			 }
			 
			 
			 thisMap=cutmap.returnMaze();
			 num = new int[thisMap.length][thisMap[0].length];
				for(int i=0;i<thisMap.length;i++) {
					for(int j=0;j<thisMap[0].length;j++) {
						num[i][j]=0;
					}
				}
	}
	
	
	
	//�ı��������Թ�
	public void getHeiAndWid(int size) {
		int height = 0;
		int width  = 0;
		try {
			//��ȡ����ĳ��Ϳ�
		height = Integer.parseInt(Xpos.getText());
		width = Integer.parseInt(Ypos.getText());
		}
		catch(Exception ex) {
			Stage tip = new Stage();
			HBox pane = new HBox();
			Text text = new Text("����������"); 
			pane.getChildren().add(text);
			pane.setAlignment(Pos.CENTER);
			Scene scene = new Scene(pane);
			tip.setScene(scene);
			tip.setHeight(100);
			tip.setWidth(250);
			tip.setResizable(false);
			tip.setTitle("����");
			tip.show();
		}
		
		if(height!=0&&width!=0) {
			
			maze cutmap = null ;
			
			//����ͼ�ŵ��м�
			if(size ==1) {
				cutmap = new prim(height,width);
			}
			else if(size ==2) {
				cutmap = new Cutmap(height,width);
			}
			else {
				System.out.println("warning");
			}
			// cutmap.show();
			 makemap(cutmap);
			 
			
			 
		}
	}
	
	
}


/*class returnMap implements EventHandler<ActionEvent>{

	public Stage stage = new Stage();
	
	public returnMap(Stage stage) {
		this.stage = stage;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.stage.show();
	}
	
}*/



//�����ѡ��������Ϸ����
class startGame implements EventHandler<ActionEvent>{
	public Stage stage =new Stage();
	
	public startGame(Stage stage){
		this.stage = stage;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Stage gameMenu = new Stage();
		
		BorderPane backPane = new BorderPane();
		backPane.setStyle("-fx-background-image:url(�γ����/backPhoto.jfif)");
		
		Pane topPane = new Pane();
		Image topName = new Image("�γ����/name.PNG");
		ImageView gameName = new ImageView(topName);
		topPane.getChildren().add(gameName);
		
		Image left = new Image("�γ����/ͼƬ1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		Image right = new Image("�γ����/ͼƬ2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		
		Image botton = new Image("�γ����/ͼƬ4_��ͼ��.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		HBox bottomPane = new HBox(bottonPhoto);
		bottomPane.setPadding(new Insets(100, 0, 0, 250));
		
		
		VBox centerPane = new VBox(100);
		
		Image startGame1 = new Image("�γ����/��ģʽ_��ͼ��.png",130,130,true,true);
		ImageView startPhoto1 = new ImageView(startGame1);
		Button start1 = new Button("",startPhoto1);
		centerPane.setPadding(new Insets(20, 0, 0, 60));
	
		Image startGame2 = new Image("�γ����/����ģʽ.png",130,130,true,true);
		ImageView startPhoto2 = new ImageView(startGame2);
		Button start2 = new Button("",startPhoto2);
		centerPane.setPadding(new Insets(0, 0, 0, 60));
		
		
		centerPane.getChildren().add(start1);
		centerPane.getChildren().add(start2);
		
		
		backPane.setTop(topPane);
		backPane.setLeft(leftPhoto);
		backPane.setRight(rightPhoto);
		backPane.setBottom(bottomPane);
		backPane.setCenter(centerPane);
		Scene scene = new Scene(backPane);
		
		
		gameMenu.setScene(scene);
		gameMenu.setHeight(500);
		gameMenu.setWidth(570);
		gameMenu.setResizable(false);
		gameMenu.setTitle("����");
		gameMenu.show();
		
		this.stage.close();
	
		
		SimpleMap map = new SimpleMap(gameMenu);
		start1.setOnAction(map);
	}
	
}

//����ͼ��ģʽ
class Special extends formalMap implements EventHandler<ActionEvent>{

//	public TextField Xpos = new TextField();
//	public TextField Ypos = new TextField();
//	public Stage stage =new Stage();
//	public BorderPane backPane = new BorderPane();
//	public GridPane vbox = new GridPane();
//	public  int [][] thisMap ;
//	public ArrayList<String> Visited1;
//	public Stack<String> Road1;
//	public Rectangle [][] rectangles;
//	public int [][] num 
//	public makeSpecicalMap makeSpecicalMap;
	public int x1=0;
	public int y1=0;
	public int x2=0;
	public int y2=0;
	
	
	public Special(Stage stage) {
		super(stage);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
				Stage simpleGame = new Stage();
				
				backPane.setStyle("-fx-background-image:url(�γ����/timg.jpg)");
				
				Image topName = new Image("�γ����/name.PNG");
				ImageView gameName = new ImageView(topName);
				
				
				Image left = new Image("�γ����/ͼƬ1.png",150,200,true,true);
				ImageView leftPhoto = new ImageView(left);
				
				Image right = new Image("�γ����/ͼƬ2.png",150,200,true,true);
				ImageView rightPhoto = new ImageView(right);
				
				
				Image botton = new Image("�γ����/ͼƬ4_��ͼ��.png",300,300,true,true);
				ImageView bottonPhoto = new ImageView(botton);
				
				//����м���Ϸ����--------------------------------------------------------------------------------------------------
				GridPane hbox = new GridPane();
				
				
				Image img1 = new Image("�γ����/�����Թ�_��ͼ��.PNG",130,130,true,true);
				Image img2 = new Image("�γ����/Ѱ��·��_��ͼ��.PNG",130,130,true,true);
				Image img3 = new Image("�γ����/�����Թ�_��ͼ��.PNG",130,130,true,true);
				Image img4 = new Image("�γ����/����Ѱ·_��ͼ��.PNG",130,130,true,true);
				Image img5 = new Image("�γ����/�����Թ�_��ͼ��.PNG",130,130,true,true);
				Image img6 = new Image("�γ����/�����Թ�_��ͼ��.PNG",130,130,true,true);
				Image img7 = new Image("�γ����/�˳�_��ͼ��.PNG",100,30,true,true);
				
				
				ImageView imgView1 = new ImageView(img1);
				ImageView imgView2 = new ImageView(img2);
				ImageView imgView3 = new ImageView(img3);
				ImageView imgView4 = new ImageView(img4);
				ImageView imgView5 = new ImageView(img5);
				ImageView imgView6 = new ImageView(img6);
				ImageView imgView7 = new ImageView(img7);
				
				Button bt1 = new Button("",imgView1);
				
				Button bt2 = new Button("",imgView2);
				
				Button bt3 = new Button("",imgView3);
				
				Button bt4 = new Button("",imgView4);
				
				Button bt5 = new Button("",imgView5);
				
				Button bt6 = new Button("",imgView6);
				
				Button bt7 = new Button("",imgView7);
				
				
				//HBox hbox = new HBox(15);
				//hbox.setAlignment(Pos.CENTER);
				//��button�ŵ�center�ĵ����
				hbox.addRow(0,bt1, bt2, bt3, bt4, bt5,bt6,bt7);
				hbox.setAlignment(Pos.CENTER);
				
			//����м���Ϸ����--------------------------------------------------------------------------------------------------
				
				//���
				VBox setXPos = new VBox();
				
				Xpos.setEditable(true);//�ɱ༭
				
				Image heightName = new Image("�γ����/�߶�_��ͼ��.PNG");
				ImageView hName = new ImageView(heightName);
				
				
				setXPos.getChildren().add(hName);
				setXPos.getChildren().add(Xpos);
				setXPos.getChildren().add(leftPhoto);
				setXPos.setAlignment(Pos.CENTER);
				
				//�Ҳ�
				VBox setYPos = new VBox();
				Ypos.setEditable(true);//�ɱ༭
				Image widthName = new Image("�γ����/���_��ͼ��.PNG");
				ImageView wName = new ImageView(widthName);
				
				setYPos.getChildren().add(wName);
				setYPos.getChildren().add(Ypos);
				setYPos.getChildren().add(rightPhoto);
				setYPos.setAlignment(Pos.CENTER);
				
				
				
				
				BorderPane.setAlignment(bottonPhoto, Pos.CENTER);
				//BorderPane.setAlignment(rightPhoto, Pos.CENTER);
				//BorderPane.setAlignment(setXPos, Pos.CENTER);
				BorderPane.setAlignment(gameName, Pos.CENTER);
				BorderPane.setAlignment(hbox, Pos.CENTER);
				
				backPane.setTop(hbox);
				backPane.setLeft(setXPos);
				backPane.setRight(setYPos);
				backPane.setBottom(bottonPhoto);
				//backPane.setCenter(hbox);
				backPane.setCenter(vbox);
				
				//center
				
			//---------------------------------------------------------------------------------------------------------------------	
				//getHeiAndWid();
				
				Scene scene = new Scene(backPane);
				simpleGame.setScene(scene);
				simpleGame.setHeight(800);
				simpleGame.setWidth(1300);
				simpleGame.setResizable(false);
				simpleGame.setTitle("����ģʽ");
				simpleGame.show();
				this.stage.close();
				
				
				
			//�¼�����
				//���buttom1 �����ɵ�ͼ
				bt1.setOnAction(e->getHeiAndWidspecial());
				
				
				
				
				bt5.setOnAction(e->reflesh(simpleGame));
				bt2.setOnAction(e->findMin1());
				//---------------------------------------
				
				bt4.setOnAction(e->StapFindRoadBySpecial());
				//formalMap map = new formalMap(gameMenu);
				
				start newstart = new start(simpleGame);
				bt7.setOnAction(e->newstart.handle(null));
			//	returnMap map = new returnMap(this.stage);
				bt3.setOnAction(e->{
//						traverse tra = new traverse();
//						Thread  thread = new Thread(tra);
//						thread.start();
				});
				
				bt6.setOnAction(e->{});
		
	}
	
	
	
	
public boolean findAround1(String str,ArrayList<String> array) {
		
		boolean isWallAll = false;
		
		int x1=0;
		int y1=0;
		
		//��X��Y��ֵ���ַ�������ȡ����
		
		String[] newcoord =new String[2];
		newcoord=str.split(",", 2);
		
		x1 = Integer.parseInt(newcoord[0]);
		y1 = Integer.parseInt(newcoord[1]);
		
		System.out.println("");
		System.out.println(x1+","+y1);
		if((thisMap[x1-1][y1]!=0&&!array.contains((x1-1)+","+y1))||(thisMap[x1][y1+1]!=0&&!array.contains((x1)+","+(y1+1)))||
				(thisMap[x1][y1-1]!=0&&!array.contains((x1)+","+(y1-1)))||(thisMap[x1+1][y1]!=0&&!array.contains((x1+1)+","+y1))) {
			isWallAll =true;
			}
		
		return isWallAll;
	}
	
public void findMin1() {
	
	
	//�洢ÿ������Ȩֵ
//	int [][] num =new int [thisMap.length][thisMap[0].length];
//	for(int i=0;i<thisMap.length;i++) {
//		for(int j=0;j<thisMap[0].length;j++) {
//			num[i][j]=0;
//		}
//	}
	
	ArrayList<String> Visited = new ArrayList<String>();
	Stack<String> Road = new Stack<String>();
	
	ArrayList<Stack<String>> findRoad = new ArrayList<Stack<String>>(); 
	
	Road=Road1;

	Visited=Visited1;
	
	
	/*for(int i=0;i<thisMap.length;i++) {
		for(int j=0;j<thisMap[0].length;j++) {
			System.out.print(thisMap[i][j]+" ");
		}
		System.out.println("");
	}*/
	//System.out.println((thisMap.length-2)+","+(thisMap[0].length-2));
	Stack<String> stack;
	while(!Road.isEmpty()) {
		//����Ѿ�������,��ջ��Ԫ�ش浽�浽�ɱ䳤����	
		String[] newcoord1 =new String[2];
		newcoord1=Road.peek().split(",", 2);
		
		int x1 = Integer.parseInt(newcoord1[0]);
		int y1 = Integer.parseInt(newcoord1[1]);
		
		if(Road.peek().equals(((x2)+","+(y2)))){
			stack= new Stack<String>();
			//��ȸ���
			for(int i=0;i<Road.size();i++) {
				stack.push(Road.get(i));
			}
			
			findRoad.add(stack);
		}
		//��������յ������Χû·�ˣ��ͳ�ջ���˻���һ������
		if(Road.peek().equals(((x2)+","+(y2)))||(!findAround(Road.peek(),Visited)
				&&(num[x1][y1]+1>=num[x1-1][y1]
						&&num[x1][y1]+1>=num[x1][y1-1]
						&&num[x1][y1]+1>=num[x1][y1+1]
						&&num[x1][y1]+1>=num[x1+1][y1]))) {
			Road.pop();
			continue;
		}
		//������Χ�����꣬���ѡȡһ��δ��Visited�����꣬��ջ
	
		
		while(Road.peek()!=((x2)+","+(y2))&&(findAround(Road.peek(),Visited)
				||num[x1][y1]+1<num[x1-1][y1]
				||num[x1][y1]+1<num[x1][y1-1]
				||num[x1][y1]+1<num[x1][y1+1]
				||num[x1][y1]+1<num[x1+1][y1])) {
			String[] newcoord =new String[2];
			newcoord=Road.peek().split(",", 2);
			
			int x = Integer.parseInt(newcoord[0]);
			int y = Integer.parseInt(newcoord[1]);
			//���ȱ����ұ�
			if(thisMap[x][y+1]!=0&&((!Visited.contains((x)+","+(y+1))||(num[x][y]+1<num[x][y+1]))||(x==(x2)&&(y+1)==(y2)))) {
				num[x][y+1]=num[x][y]+1;
				Visited.add(x+","+(y+1));
				Road.push(x+","+(y+1));
				break;
			}
			
			if(thisMap[x+1][y]!=0&&((!Visited.contains((x+1)+","+(y))||(num[x][y]+1<num[x+1][y]))||((x+1)==(x2)&&y==(y2)))) {
				num[x+1][y]=num[x][y]+1;
				Visited.add((x+1)+","+y);
				Road.push((x+1)+","+y);
				break;
			}
			
			if(thisMap[x][y-1]!=0&&((!Visited.contains((x)+","+(y-1))||(num[x][y]+1<num[x][y-1]))||(x==(x2)&&(y-1)==(y2)))) {
				num[x][y-1]=num[x][y]+1;
				Visited.add(x+","+(y-1));
				Road.push(x+","+(y-1));
				break;
			}
			
			if(thisMap[x-1][y]!=0&&((!Visited.contains((x-1)+","+(y))||(num[x][y]+1<num[x-1][y]))||((x-1)==(x2)&&y==(y2)))) {
				num[x-1][y]=num[x][y]+1;
				Visited.add((x-1)+","+y);
				Road.push((x-1)+","+y);
				break;
			}
		}
		
		int max=0;
		//�ҳ����·��
		
		for(int i=0;i<findRoad.size();i++) {
			for(int j=0;j<findRoad.get(i).size();j++) {
				System.out.println(findRoad.get(i).get(j));
			}
			System.out.print("******");
		}
		
		for(int i=1;i<findRoad.size();i++) {
			if(findRoad.get(i).size()<findRoad.get(max).size()) {
				max=i;
			}
		}
		
		//������·��������
		String[] newcoord =new String[2];
		
		
		int x =0;
		int y =0;
		
			Image[][] map = new Image[thisMap.length+2][thisMap[0].length+2];
		 ImageView[][] mapPhoto = new ImageView[thisMap.length+2][thisMap[0].length+2];
			
			double len = (600/(thisMap.length)) > (600/(thisMap[0].length)) ? (600/(thisMap.length)) : (600/(thisMap[0].length));
			
		int [][] minRode = new int[2][findRoad.get(max).size()];
		
		
		for(int j=0;j<findRoad.get(max).size();j++) {
			System.out.println(findRoad.get(max).get(j));
		}
		
		
		for(int j=0;j<findRoad.get(max).size();j++) {
			newcoord=findRoad.get(max).get(j).split(",", 2);
			 x = Integer.parseInt(newcoord[0]);
			 y = Integer.parseInt(newcoord[1]);
			 
			 minRode[0][j]=x;
			 minRode[1][j]=y;
		}
		
		

	
		for(int i=1;i<minRode[0].length-1;i++) {
			//height���䣬width��һ   ����
			if(minRode[0][i]==minRode[0][i+1]&&minRode[1][i+1]==minRode[1][i]+1) {
				rectangles[minRode[0][i]][minRode[1][i]].setFill(Color.AQUAMARINE);
				
			}
			//height���䣬width��һ  ����
			if(minRode[0][i]==minRode[0][i+1]&&minRode[1][i+1]==minRode[1][i]-1) {
				rectangles[minRode[0][i]][minRode[1][i]].setFill(Color.AQUAMARINE);
				
			}
				
			//width���䣬height��һ ����
			if(minRode[1][i]==minRode[1][i+1]&&minRode[0][i+1]==minRode[0][i]+1) {
				rectangles[minRode[0][i]][minRode[1][i]].setFill(Color.AQUAMARINE);
				
			}	
			//width���䣬height��һ  ����
			if(minRode[1][i]==minRode[1][i+1]&&minRode[0][i+1]==minRode[0][i]-1) {
				rectangles[minRode[0][i]][minRode[1][i]].setFill(Color.AQUAMARINE);
				
			}
		}
		
		
	}
}
	
	//���ε���Ѱ·
			public void StapFindRoadBySpecial() {
			
				//ArrayList<Stack<String>> findRoad = new ArrayList<Stack<String>>(); 
			
				
					String[] newcoord =new String[2];
					
					int x;
					int y;
				
					
					if(Road1.isEmpty())
						return;
				/*for(int i=0;i<thisMap.length;i++) {
					for(int j=0;j<thisMap[0].length;j++) {
						System.out.print(thisMap[i][j]+" ");
					}
					System.out.println("");
				}*/
				//System.out.println((thisMap.length-2)+","+(thisMap[0].length-2));
					String[] newcoord1 =new String[2];
					newcoord1=Road1.peek().split(",", 2);
					
					int x1 = Integer.parseInt(newcoord1[0]);
					int y1 = Integer.parseInt(newcoord1[1]);
				//double len = (500/(thisMap.length)) > (500/(thisMap[0].length)) ? (500/(thisMap.length)) : (500/(thisMap[0].length));
				if(!Road1.isEmpty()) {
					
					//��������յ������Χû·�ˣ��ͳ�ջ���˻���һ������
					if(Road1.peek().equals(((x2)+","+(y2)))||(!findAround1(Road1.peek(),Visited1)
							&&(num[x1][y1]+1>=num[x1-1][y1]
							&&num[x1][y1]+1>=num[x1][y1-1]
							&&num[x1][y1]+1>=num[x1][y1+1]
							&&num[x1][y1]+1>=num[x1+1][y1]))) {
						if(!findAround1(Road1.peek(),Visited1)&&!Road1.peek().equals(((x2)+","+(y2)))&&!Road1.peek().equals(x1+","+y1)) {
						newcoord=Road1.peek().split(",", 2);
						x = Integer.parseInt(newcoord[0]);
						y = Integer.parseInt(newcoord[1]);
						rectangles[x][y].setFill(Color.BISQUE);
						}
						//rectangles[x][y].setFill(Color.BISQUE);
						Road1.pop();
					}
				
					
					//������Χ�����꣬���ѡȡһ��δ��Visited�����꣬��ջ
					if(Road1.peek()!=((thisMap.length-2)+","+(thisMap[0].length-2))&&(findAround1(Road1.peek(),Visited1)
									||num[x1][y1]+1<num[x1-1][y1]
									||num[x1][y1]+1<num[x1][y1-1]
									||num[x1][y1]+1<num[x1][y1+1]
									||num[x1][y1]+1<num[x1+1][y1])) {
						newcoord=Road1.peek().split(",", 2);
						
						 x = Integer.parseInt(newcoord[0]);
						 y = Integer.parseInt(newcoord[1]);
						 
						 
						 
						//���ȱ����ұ�
						if(thisMap[x][y+1]!=0&&(!Visited1.contains((x)+","+(y+1))||num[x][y]+1<num[x][y+1])) {
							Visited1.add(x+","+(y+1));
							Road1.push(x+","+(y+1));
							num[x][y+1]=num[x][y]+1;
							if((x!=(x2)||(y+1)!=(y2))&&(x!=x1||(y+1)!=y1)) {
								rectangles[x][y+1].setFill(Color.AQUAMARINE);
							}
							return;
						}
						//����
						if(thisMap[x+1][y]!=0&&(!Visited1.contains((x+1)+","+(y))||num[x][y]+1<num[x+1][y])) {
							num[x+1][y]=num[x][y]+1;
							Visited1.add((x+1)+","+y);
							Road1.push((x+1)+","+y);
							if(((x+1)!=(x2)||(y)!=(y2))&&((x+1)!=x1||(y)!=y1)) {
								rectangles[x+1][y].setFill(Color.AQUAMARINE);
							}
							return;
						}
						
						//���
						if(thisMap[x][y-1]!=0&&(!Visited1.contains((x)+","+(y-1))||num[x][y]+1<num[x][y-1])) {
							num[x][y-1]=num[x][y]+1;
							Visited1.add(x+","+(y-1));
							Road1.push(x+","+(y-1));
							if((x!=(x2)||(y-1)!=(y2))&&(x!=x1||(y-1)!=y1)) {
								rectangles[x][y-1].setFill(Color.AQUAMARINE);
							}
							return;
						}
						
						//����
						if(thisMap[x-1][y]!=0&&(!Visited1.contains((x-1)+","+(y))||num[x][y]+1<num[x-1][y])) {
							num[x-1][y]=num[x][y]+1;
							Visited1.add((x-1)+","+y);
							Road1.push((x-1)+","+y);
							if(((x-1)!=(x2)||(y)!=(y2))&&((x-1)!=x1||(y)!=y1)) {
								rectangles[x-1][y].setFill(Color.AQUAMARINE);
							}
							return;
						}
						
					}
					
				}
			}
		
		
	
	//����ͼ������
		public void getHeiAndWidspecial() {
			int height = 0;
			int width  = 0;
			try {
				//��ȡ����ĳ��Ϳ�
			height = Integer.parseInt(Xpos.getText());
			width = Integer.parseInt(Ypos.getText());
			}
			catch(Exception ex) {
				Stage tip = new Stage();
				HBox pane = new HBox();
				Text text = new Text("����������"); 
				pane.getChildren().add(text);
				pane.setAlignment(Pos.CENTER);
				Scene scene = new Scene(pane);
				tip.setScene(scene);
				tip.setHeight(100);
				tip.setWidth(250);
				tip.setResizable(false);
				tip.setTitle("����");
				tip.show();
			}
			
			if(height!=0&&width!=0) {
				 makeSpecicalMap = new makeSpecicalMap(height, width);
				double len = (600/(makeSpecicalMap.height+2)) < (600/(makeSpecicalMap.width+2)) ? (600/(makeSpecicalMap.height+2)) : (600/(makeSpecicalMap.width+2));
				
				rectangles = new Rectangle[makeSpecicalMap.height+2][makeSpecicalMap.width+2];
				for(int i =0;i<makeSpecicalMap.height+2;i++) {
					for(int j=0;j<makeSpecicalMap.width+2;j++) {
						rectangles[i][j] = new Rectangle(len,len);
						vbox.add(rectangles[i][j], j, i);
					}
				}
				vbox.setAlignment(Pos.CENTER);
				//����ͼ�ŵ��м�
				
				 //Cutmap cutmap = new Cutmap(height,width);
				// cutmap.show();
				
				makeHeartMap heartMap = new makeHeartMap();
				Thread thread = new Thread(heartMap);
				thread.start(); 
			}
		}
		
		//���߳����ɵ�ͼ
	class makeHeartMap implements Runnable {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			makemapByColor();
		}
		
	}
	
	
	
	//�����Թ����ı���ɫ��ʽ��
	public void makemapByColor() {
		
			
			double len = (600/(makeSpecicalMap.height+2)) < (600/(makeSpecicalMap.width+2)) ? (600/(makeSpecicalMap.height+2)) : (600/(makeSpecicalMap.width+2));
			
			
			 for(int i=0;i<makeSpecicalMap.height+2;i++) {
				 for(int j=0;j<makeSpecicalMap.width+2;j++) {
					 try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 System.out.print(makeSpecicalMap.blocked[i][j]+" ");
					 
					 
					 
					 
					  if(makeSpecicalMap.blocked[i][j]==0) {
						  rectangles[i][j].setFill(Color.RED);
						
					 }
					  if(makeSpecicalMap.blocked[i][j]==1) {
						  rectangles[i][j].setFill(Color.BISQUE);
						 
					 }
					  if(makeSpecicalMap.blocked[i][j]==2) {
						  rectangles[i][j].setFill(Color.BLACK);
					 }
					  
					  if(i==makeSpecicalMap.x1&&j==makeSpecicalMap.y1) {
						    x1=i;
							
							y1=j;
						  rectangles[i][j].setFill(Color.CYAN);
					  }
					  if(i==makeSpecicalMap.x2&&j==makeSpecicalMap.y2) {
						  x2=i;
						  y2=j;
						  rectangles[i][j].setFill(Color.DARKVIOLET);
					  }
					  
					
				 }
			 }
			 
			  
			
			 thisMap=makeSpecicalMap.blocked;
			 
			 num = new int [thisMap.length][thisMap[0].length];
			 for(int i=0;i<thisMap.length;i++) {
					for(int j=0;j<thisMap[0].length;j++) {
						num[i][j]=0;
					}
				}
	
	
	 	x1=makeSpecicalMap.x1;
			   	y1=makeSpecicalMap.y1;
				x2=makeSpecicalMap.x2;
				  y2=makeSpecicalMap.y2;
				  

					Visited1 = new ArrayList<String>();
					Road1 = new Stack<String>();
					Road1.push(x1+","+y1);
					Visited1.add(x1+","+y1);
	
	}
}

















//��ģʽ���ɵ�ͼ���ݹ�ָ
//�ؿ�ģʽ�����û�����ԭʼ���������������ƶ�������ܹ��ߵ��յ���ж�Ϊʤ������ͼ��һ�����ӣ�һֱ��50*50��
//ͼƬΪ�������ѡ�񣨿��Գ��ԣ�
class SimpleMap extends formalMap implements EventHandler<ActionEvent>{
	int nativeHeight=2;
	int nativeWidth =2;
	int x=1;
	int y=1;
	Stage simpleGame;
	public SimpleMap(Stage stage) {
		super(stage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		simpleGame = new Stage();
		BorderPane backPane = new BorderPane();
		backPane.setStyle("-fx-background-image:url(�γ����/timg.jpg)");
		
		Image topName = new Image("�γ����/name.PNG");
		ImageView gameName = new ImageView(topName);
		//�������--------------------------------------------------------------------
		
		//���
		VBox setXPos = new VBox();
		
		Image img1 = new Image("�γ����/���һ_��ͼ��.PNG",130,130,true,true);
		ImageView leftimg = new ImageView(img1);
		
		Button choose1 = new Button("",leftimg);
		choose1.setFocusTraversable(false);
		
		Image left = new Image("�γ����/ͼƬ1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		setXPos.getChildren().add(choose1);
		setXPos.getChildren().add(leftPhoto);
		setXPos.setAlignment(Pos.CENTER);
		
		
		
	//------------------------------------------------------------------------------------
	//�����Ҳ�-----------------------------------------------------------------------------
		
		VBox setYPos = new VBox();
		
		Image img2 = new Image("�γ����/��Ҷ�_��ͼ��.PNG",130,130,true,true);
		ImageView rightimg = new ImageView(img2);
		
		Button choose2 = new Button("",rightimg);
		choose2.setFocusTraversable(false);
		
		Image right = new Image("�γ����/ͼƬ2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		setYPos.getChildren().add(choose2);
		setYPos.getChildren().add(rightPhoto);
		setYPos.setAlignment(Pos.CENTER);
	//-----------------------------------------------------------------------------------------------------	
		
		Image botton = new Image("�γ����/ͼƬ4_��ͼ��.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		
		//����м���Ϸ����--------------------------------------------------------------------------------------------------
		
		
		
		
		
		
		//����
		BorderPane.setAlignment(bottonPhoto, Pos.CENTER);
		BorderPane.setAlignment(rightPhoto, Pos.CENTER);
		BorderPane.setAlignment(leftPhoto, Pos.CENTER);
		BorderPane.setAlignment(gameName, Pos.CENTER);
		
		//���ͼƬ
		backPane.setTop(gameName);
		backPane.setLeft(setXPos);
		backPane.setRight(setYPos);
		backPane.setBottom(bottonPhoto);
		backPane.setCenter(vbox);
		
		
		
		Scene scene = new Scene(backPane);
		simpleGame.setScene(scene);
		simpleGame.setHeight(800);
		simpleGame.setWidth(1300);
		simpleGame.setResizable(false);
		simpleGame.setTitle("��ģʽ");
		simpleGame.show();
		vbox.requestFocus();
		this.stage.close();
		
		
		//�¼�����--------------------------------------------
		
		choose1.setOnAction(e->PlayerOne());
		choose2.setOnAction(e->Playertwo());
	}	
	
	//���̿���
	public void KeyBoardControl() {
		
		//while(x!=this.thisMap.length-2&&y!=this.thisMap[0].length-2) {}
		
			this.vbox.setOnKeyPressed(e->move(e));
	}
	
public void KeyBoardControl2() {
		
		//while(x!=this.thisMap.length-2&&y!=this.thisMap[0].length-2) {}
		
			this.vbox.setOnKeyPressed(e->move2(e));
	}
	
	public void move( KeyEvent e) {
		Image[][] map = new Image[thisMap.length][thisMap[0].length];
		ImageView[][] mapPhoto = new ImageView[thisMap.length][thisMap[0].length];
		Image[][] map1 = new Image[thisMap.length][thisMap[0].length];
		ImageView[][] mapPhoto1 = new ImageView[thisMap.length][thisMap[0].length];
		
		double len = (600/thisMap.length) < (600/thisMap[0].length) ? (600/thisMap.length) : (600/thisMap[0].length);
		
		
		
		switch(e.getCode()) {
		case DOWN:
			if(thisMap[x+1][y]!=0) {
				map[x][y] = new Image("�γ����/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 x+=1;
				 map1[x][y] = new Image("�γ����/��ɫ��.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		case UP:
			if(thisMap[x-1][y]!=0) {
				map[x][y] = new Image("�γ����/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 x-=1;
				 map1[x][y] = new Image("�γ����/��ɫ��.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);		
			}
			break;
		case LEFT:
			if(thisMap[x][y-1]!=0) {
				map[x][y] = new Image("�γ����/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 y-=1;
				 map1[x][y] = new Image("�γ����/��ɫ��.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		case RIGHT:
			if(thisMap[x][y+1]!=0) {
				map[x][y] = new Image("�γ����/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 y+=1;
				 map1[x][y] = new Image("�γ����/��ɫ��.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		default:
			break;
		}
		
		if(x==this.thisMap.length-2&&y==this.thisMap[0].length-2)
		{
			Stage tip = new Stage();
			VBox pane = new VBox();
			Text text = new Text("�Ƿ������Ϸ"); 
			Button button1 = new Button("����");
			Button button2 = new Button("�˳�");
			pane.getChildren().add(text);
			pane.getChildren().add(button1);
			pane.getChildren().add(button2);
			pane.setAlignment(Pos.CENTER);
			Scene scene = new Scene(pane);
			tip.setScene(scene);
			tip.setHeight(100);
			tip.setWidth(250);
			tip.setResizable(false);
			tip.setTitle("��ʾ");
			tip.show();
			
			button1.setOnAction(z->{
				tip.close();
				x=1;
				y=1;
				
				nativeHeight++;
				nativeWidth++;
				PlayerOne();
			});
			start newstart = new start(simpleGame);
			button2.setOnAction(z->{
				tip.close();
				newstart.handle(null);
				});
		}
		
	}
	
	
	public void move2( KeyEvent e) {
		Image[][] map = new Image[thisMap.length][thisMap[0].length];
		ImageView[][] mapPhoto = new ImageView[thisMap.length][thisMap[0].length];
		Image[][] map1 = new Image[thisMap.length][thisMap[0].length];
		ImageView[][] mapPhoto1 = new ImageView[thisMap.length][thisMap[0].length];
		
		double len = (600/thisMap.length) < (600/thisMap[0].length) ? (600/thisMap.length) : (600/thisMap[0].length);
		
		
		
		switch(e.getCode()) {
		case DOWN:
			if(thisMap[x+1][y]!=0) {
				map[x][y] = new Image("�γ����/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 x+=1;
				 map1[x][y] = new Image("�γ����/��ɫһ.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		case UP:
			if(thisMap[x-1][y]!=0) {
				map[x][y] = new Image("�γ����/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 x-=1;
				 map1[x][y] = new Image("�γ����/��ɫһ.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);		
			}
			break;
		case LEFT:
			if(thisMap[x][y-1]!=0) {
				map[x][y] = new Image("�γ����/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 y-=1;
				 map1[x][y] = new Image("�γ����/��ɫһ.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		case RIGHT:
			if(thisMap[x][y+1]!=0) {
				map[x][y] = new Image("�γ����/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 y+=1;
				 map1[x][y] = new Image("�γ����/��ɫһ.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		default:
			break;
		}
		
		if(x==this.thisMap.length-2&&y==this.thisMap[0].length-2)
		{
			Stage tip = new Stage();
			VBox pane = new VBox();
			Text text = new Text("�Ƿ������Ϸ"); 
			Button button1 = new Button("����");
			Button button2 = new Button("�˳�");
			pane.getChildren().add(text);
			pane.getChildren().add(button1);
			pane.getChildren().add(button2);
			pane.setAlignment(Pos.CENTER);
			Scene scene = new Scene(pane);
			tip.setScene(scene);
			tip.setHeight(100);
			tip.setWidth(250);
			tip.setResizable(false);
			tip.setTitle("��ʾ");
			tip.show();
			
			button1.setOnAction(z->{
				tip.close();
				x=1;
				y=1;
				
				nativeHeight++;
				nativeWidth++;
				Playertwo();
			});
			start newstart = new start(simpleGame);
			button2.setOnAction(z->{
				tip.close();
				newstart.handle(null);
				});
		}
		
	}
	
	
	
	//ѡ�������һ����ʼ��Ϸ
	public void PlayerOne() {
		
		
		Cutmap cutmap = new Cutmap(nativeHeight,nativeWidth);
		double len = (600/(cutmap.height+2)) < (600/(cutmap.width+2)) ? (600/(cutmap.height+2)) : (600/(cutmap.width+2));
		
		
		
		makemap(cutmap);
		KeyBoardControl();
	}
	
	//ѡ������Ҷ�����ʼ��Ϸ
		public void Playertwo() {
			

			
			Cutmap cutmap = new Cutmap(nativeHeight,nativeWidth);
			double len = (600/(cutmap.height+2)) < (600/(cutmap.width+2)) ? (600/(cutmap.height+2)) : (600/(cutmap.width+2));
			
			Image img1 = new Image("�γ����/��ɫһ.PNG",len,len,true,true);
			ImageView leftimg = new ImageView(img1);
			
			makemap2(cutmap);
			KeyBoardControl2();
		}
	
	//�����Թ�
	public void makemap(Cutmap cutmap) {
	
		 Image[][] map = new Image[cutmap.height+2][cutmap.width+2];
			
			
			ImageView[][] mapPhoto = new ImageView[cutmap.height+2][cutmap.width+2];
			
			double len = (600/(cutmap.height+2)) < (600/(cutmap.width+2)) ? (600/(cutmap.height+2)) : (600/(cutmap.width+2));
			
			/*for(int i=0;i<cutmap.height+2;i++) {
				for(int j=0;j<cutmap.width+2;j++) {
					 rectangle[i][j] = new Rectangle(len, len);
					if(i==1&&j==1)
						rectangle[i][j].setFill(Color.AQUAMARINE);
					else if(i==cutmap.height&&j==cutmap.width) 
						rectangle[i][j].setFill(Color.CRIMSON);
				
						else if(cutmap.blocked[i][j]==0)
							rectangle[i][j].setFill(Color.BLACK);
						else if(cutmap.blocked[i][j]==1)
							rectangle[i][j].setFill(Color.GRAY);
					
							rectangle[i][j].setStroke(Color.WHITE);
				}
			}
			
			
			vbox.setAlignment(Pos.CENTER);
			
			for(int i=0;i<cutmap.height+2;i++) {
				for(int j=0;j<cutmap.width+2;j++) {
					vbox.add(rectangle[i][j], i, j);
				}
				}
			*/
			vbox.getChildren().clear();
			
			vbox.setAlignment(Pos.CENTER);
			 for(int i=0;i<cutmap.height+2;i++) {
				 for(int j=0;j<cutmap.width+2;j++) {
					 
					 System.out.print(cutmap.blocked[i][j]+" ");
					 
					  if(cutmap.blocked[i][j]==0) {
						 map[i][j] = new Image("�γ����/2.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					  if(cutmap.blocked[i][j]==1) {
						 map[i][j] = new Image("�γ����/1.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					
					 if(i==1&&j==1) {
						 Image img1 = new Image("�γ����/��ɫ��.PNG",len,len,true,true);
							ImageView leftimg = new ImageView(img1);
						 vbox.add(leftimg, j, i);
					 }
					 
					 if(i==cutmap.height&&j==cutmap.width) {
						 map[i][j] = new Image("�γ����/�յ�1.png",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }	 
				 }
				 System.out.println("");
			 }
			 
			 
			 thisMap=cutmap.blocked;
	}
	
	
	public void makemap2(Cutmap cutmap) {
		
		 Image[][] map = new Image[cutmap.height+2][cutmap.width+2];
			
			
			ImageView[][] mapPhoto = new ImageView[cutmap.height+2][cutmap.width+2];
			
			double len = (600/(cutmap.height+2)) < (600/(cutmap.width+2)) ? (600/(cutmap.height+2)) : (600/(cutmap.width+2));
			
			/*for(int i=0;i<cutmap.height+2;i++) {
				for(int j=0;j<cutmap.width+2;j++) {
					 rectangle[i][j] = new Rectangle(len, len);
					if(i==1&&j==1)
						rectangle[i][j].setFill(Color.AQUAMARINE);
					else if(i==cutmap.height&&j==cutmap.width) 
						rectangle[i][j].setFill(Color.CRIMSON);
				
						else if(cutmap.blocked[i][j]==0)
							rectangle[i][j].setFill(Color.BLACK);
						else if(cutmap.blocked[i][j]==1)
							rectangle[i][j].setFill(Color.GRAY);
					
							rectangle[i][j].setStroke(Color.WHITE);
				}
			}
			
			
			vbox.setAlignment(Pos.CENTER);
			
			for(int i=0;i<cutmap.height+2;i++) {
				for(int j=0;j<cutmap.width+2;j++) {
					vbox.add(rectangle[i][j], i, j);
				}
				}
			*/
			vbox.getChildren().clear();
			
			vbox.setAlignment(Pos.CENTER);
			 for(int i=0;i<cutmap.height+2;i++) {
				 for(int j=0;j<cutmap.width+2;j++) {
					 
					 System.out.print(cutmap.blocked[i][j]+" ");
					 
					  if(cutmap.blocked[i][j]==0) {
						 map[i][j] = new Image("�γ����/2.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					  if(cutmap.blocked[i][j]==1) {
						 map[i][j] = new Image("�γ����/1.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					
					 if(i==1&&j==1) {
						 Image img1 = new Image("�γ����/��ɫһ.PNG",len,len,true,true);
							ImageView leftimg = new ImageView(img1);
						 vbox.add(leftimg, j, i);
					 }
					 
					 if(i==cutmap.height&&j==cutmap.width) {
						 map[i][j] = new Image("�γ����/�յ�1.png",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }	 
				 }
				 System.out.println("");
			 }
			 
			 
			 thisMap=cutmap.blocked;
	}
	
	
	

	

	
	
	
}
//------------------------------------------------------------��Ϸ�㷨����----------------------------------------------
class prim extends maze{
	public int height;
	public int width;
	//��ŵ�ͼ
	public int [][] maps;
	//���δ���ͨ·�Ķ�
	private ArrayList<String> saveRoll = new ArrayList<String>(); 
	//����Ѿ����ʹ��ĵ�
	private ArrayList<String> Roll = new ArrayList<String>(); 
	//�����
	private Random ran = new Random();
	
	public prim(int height,int width) {
		this.height = 2*height+1;
		this.width = 2*width+1;
		maps = new int[this.height][this.width];
		MadeMap();
	}
	
	//��ʼ��
	//0Ϊǽ��1Ϊ��
	public void MadeMap() {
		
		//����Ϊǽ
		for(int i=0;i<width;i++) {
			//��
			maps[0][i]=0;
			//��
			maps[height-1][i]=0;
		}
		//���Ҳ�
		for(int i=0;i<height;i++) {
			maps[i][0]=0;
			maps[i][width-1]=0;
		}
		
		//�м��Թ����ֳ�ʼ��
		for(int i=1;i<this.height-1;i++) {
			for(int j=1;j<this.width-1;j++) {
				//ż�������ǽ��
				if(i%2==0) {
					maps[i][j]=0;
				}
				else
				{
					if(j%2==1) {
						maps[i][j]=1;
					}
				}
			}
		}
		//�����һ��
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print(maps[i][j]+" ");
			}
			System.out.println("");
		}
		
		//����ͼ�е�·�浽һ���ɱ䳤�����У�Ȼ��ʼ��ʱ���������ѡȡһ��λ��
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(maps[i][j]==1) {
					saveRoll.add(i+","+j);
				}
			}
		}
		//�����һ��
		for(int i=0;i<saveRoll.size();i++) {
			System.out.println(saveRoll.get(i));
		}
		//���ѡȡһ������
		int start;
		 start = ran.nextInt(saveRoll.size());
		 
		 String [] start1; 
		 //������浽start1��
		 start1 = saveRoll.get(start).split(",");
		 int x1 = Integer.parseInt(start1[0]);
		 int y1 = Integer.parseInt(start1[1]);
		 
		 //���п���
		 openADoor(x1,y1);
		 
		 
		 //�����Ч��
		 for(int i=0;i<maps.length;i++) {
			 for(int j=0;j<maps[i].length;j++) {
				 System.out.print(maps[i][j]+" ");
			 }
			 System.out.println("");
		 }
		 
	}
	
	//���п���
	public void openADoor(int x,int y) {
		//������ڱ߽磬����Խ��ĵط�����
		//��������ڱ߽磬�����һ������
		//Ȼ���ж��Ǹ������������Ϊ�����Ƿ��Ƕ�
		//����Ƕ��������������м��ǽ��Ϊһ��ͨ·��������һ���ڵ��Ƴ����Զ���Ϊ��һ���ڵ�
		//������Ǿ��������λ�ã�ֱ������Χ�ĸ��㶼ѭ����
		//���ѡ��������λ��(0,1,2,3)�ֱ�����ĸ�����
		
		
		
		
		if(saveRoll.size()==1) {
			return;
		}
		
		
		int open = ran.nextInt(4);
		
		
		//�ϱ߽粢�ҿ���λ��Ϊ��
		if(x==1&&open==0) {
			open=2;
		}
		//��߽粢�ҿ���λ��Ϊ��
		if(y==1&&open==3) {
			open=1;
		}	
		//�ұ߽粢�ҿ���λ��Ϊ��
		if(y==(this.width-2)&&open==1) {
			open=3;
		}	
		//�±߽粢�ҿ���λ��Ϊ��
		if(x==(this.height-2)&&open==2) {
			open=0;
		}
		
		//�����ж�
		//x-2
		if(open==0) {
			if(saveRoll.contains((x-2)+","+y))
			{
				//������֮���ǽ��ͨ
				this.maps[x-1][y]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x-2,y);
			}
			//�����ж�
			if((y+2)<=(this.width-1)&&saveRoll.contains(x+","+(y+2))) {

				//������֮���ǽ��ͨ
				this.maps[x][y+1]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x,y+2);
			}
			//�����ж�
			if((x+2)<=(this.height-1)&&saveRoll.contains((x+2)+","+y)) {
				//������֮���ǽ��ͨ
				this.maps[x+1][y]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x+2,y);
			}
			//�����ж�
			if((y-2)>=0&&saveRoll.contains(x+","+(y-2))) {
				//������֮���ǽ��ͨ
				this.maps[x][y-1]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x,y-2);
			}	
			
			
		}
		//�����ж�
		//y+2
		else if(open==1) {
			if(saveRoll.contains(x+","+(y+2)))
			{
				//������֮���ǽ��ͨ
				this.maps[x][y+1]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x,y+2);
			}
			
			//�����ж�
			if((x+2)<=(this.height-1)&&saveRoll.contains((x+2)+","+y)) {
				//������֮���ǽ��ͨ
				this.maps[x+1][y]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x+2,y);
			}
			//�����ж�
			if((y-2)>=0&&saveRoll.contains(x+","+(y-2))) {
				//������֮���ǽ��ͨ
				this.maps[x][y-1]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x,y-2);
			}	
			
		}
		
		
		
		//�����ж�
		//x+2 
		else if(open==2) {
			if(saveRoll.contains((x+2)+","+y))
			{
				//������֮���ǽ��ͨ
				this.maps[x+1][y]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x+2,y);
			}
			
			//�����ж�
			if((y-2)>=0&&saveRoll.contains(x+","+(y-2))) {
				//������֮���ǽ��ͨ
				this.maps[x][y-1]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x,y-2);
			}	
			
			//�����ж�
			if((x-2)>=0&&saveRoll.contains((x-2)+","+y)) {
				//������֮���ǽ��ͨ
				this.maps[x-1][y]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x-2,y);
			}
			//�����ж�
			if((y+2)<=(this.width-1)&&saveRoll.contains(x+","+(y+2))) {
				//������֮���ǽ��ͨ
				this.maps[x][y+1]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x,y+2);
			}
		}
		//�����ж�
		//y-2
		else if(open==3) {
			if(saveRoll.contains((x-2)+","+y))
			{
				//������֮���ǽ��ͨ
				this.maps[x][y-1]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x,y-2);
			}
			
			//�����ж�
			if((x-2)>=0&&saveRoll.contains((x-2)+","+y)) {
				//������֮���ǽ��ͨ
				this.maps[x-1][y]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x-2,y);
			}
			
			//�����ж�
			if((y+2)<=(this.width-1)&&saveRoll.contains(x+","+(y+2))) {
				//������֮���ǽ��ͨ
				this.maps[x][y+1]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x,y+2);
			}
			//�����ж�
			if((x+2)<=(this.height-1)&&saveRoll.contains((x+2)+","+y)) {
				//������֮���ǽ��ͨ
				this.maps[x+1][y]=1;
				//��ӵ��ѷ����б�
				Roll.add(x+","+y);
				//�Ƴ�����ǰ������
				saveRoll.remove(x+","+y);
				//��ǰ���ó���һλ������
				openADoor(x+2,y);
			}
		}
		
		saveRoll.remove(x+","+y);
		
		
		
		//������ܶ���ͨ�ˣ��ʹ��Ѿ����ʹ��ĵ������ѡȡһ��
		
			int openNew = ran.nextInt(Roll.size());
			String [] start1; 
			 //������浽openNew��
			 start1 = Roll.get(openNew).split(",");
			 int x1 = Integer.parseInt(start1[0]);
			 int y1 = Integer.parseInt(start1[1]);
			 
			 openADoor(x1,y1);
		
	}

	@Override
	public int[][] returnMaze() {
		// TODO Auto-generated method stub
		return maps;
	}
	
}



//�ݹ��и���ɵ�ͼ
class Cutmap extends maze{
	//0Ϊǽ��1Ϊ·
	private static final int wall = 0;
	private static final int root = 1;
	public int height;
	public int width;
	public int blocked [][];
	Random r =new Random();
	
	public Cutmap() {
		
	}
	
	public Cutmap(int height,int width){
		this.height = 2*height+1;
		this.width = 2*width+1;
		blocked = new int[this.height+2][this.width+2];
		Initialize();
		genMaze(1,1,this.height,this.width);
	}
	
	//��ʼ��
	private void Initialize() {
		
		for(int i=0;i<height+2;i++) {
			//��һ��
			blocked[i][0]=wall;
			//���һ��
			blocked[i][width+1]=wall;
		}
		
		for(int j=0;j<width+2;j++) {
			//��һ��
			blocked[0][j]=wall;
			//���һ��
			blocked[height+1][j]=wall;
		}
		for(int i=1;i<height+1;i++) {
			for(int j=1;j<width+1;j++) {
				blocked[i][j]=root;
			}
		}
	}
	/**
 * �Թ������㷨�����õݹ鷽ʽʵ�֣���������������ߣ�Ȼ�������������������
 * @param x���Թ�����x����
 * @param y���Թ�����y����
 * @param height���Թ��ĸ߶�
 * @param width���Թ��Ŀ��
 * ***********
 * *         *
 * *         *
 * ***********
 * ��������Թ����ĸ�����Ϊ��1,1,2,9
 * ��ż����ǽ�ڣ���������
 * ��С�Թ�ִ�����������ֱ���Թ��߶Ȼ���Ϊ1Ϊֹ
 */
	
	 /**
 * �ڸ��������ϴ�һ��λ���������
 */
private  void openAdoor(int x1, int y1, int x2, int y2) {
    int pos;
    if (x1 == x2) {
        pos = y1 + r.nextInt((y2 - y1 )/2+ 1)*2;//������λ�ÿ���
        blocked[x1][pos] = root;
    } else if (y1 == y2) {
        pos = x1 + r.nextInt((x2 - x1 )/2+ 1)*2;
        blocked[pos][y1] = root;
    } else {
        System.out.println("wrong");
    }
}
	
	 private  void genMaze(int x, int y, int height, int width) {
	        int xPos, yPos;

	       if (height <= 2 || width <= 2) {
	         /*	for(int i=3;i<23;i++) {
	        		for(int j=1;j<23;j++) {
	        			if(blocked[i][j]==0&&(blocked[i-2][j]==1&&blocked[i+2][j]==1)) {
	        				blocked[i][j]=1;
	        			}
	        			
	        		}
	        	}
	        		for(int z=1;z<23;z++) {
	        		for(int j=3;j<23;j++) {
	        			if(blocked[z][j]==0&&(blocked[z][j-2]==1&&blocked[z][j+2]==1)) {
	        				blocked[z][j]=1;
	        			}	
	        		}
	        	}*/
	        	 return;
	        }
	           

	        //���Ż��ߣ���ż��λ�û���
	        xPos=x+r.nextInt(height/2)*2+1;
	        for (int i = y; i < y + width; i++) {
	            blocked[xPos][i] = wall;
	        }

	        //���Ż�һ���ߣ���ż��λ�û���
	        yPos=y+r.nextInt(width/2)*2+1;
	        for (int i = x; i < x + height; i++) {
	            blocked[i][yPos] = wall;
	        }

	        //����������ţ����ǽ��Ϊ1����ʱ����ת
	        
	      
	        	openAdoor(xPos, y, xPos, yPos - 1);// 1
	        	openAdoor(xPos + 1, yPos, x + height - 1, yPos);// 2
				openAdoor(xPos, yPos + 1, xPos, y + width - 1);// 3
				openAdoor(x, yPos, xPos - 1, yPos);// 4
	    
	        

	        // ���Ͻ�
	        genMaze(x, y, xPos - x, yPos - y);
	        // ���Ͻ�
	        genMaze(x, yPos + 1, xPos - x, width - yPos + y - 1);
	        // ���½�
	        genMaze(xPos + 1, y, height - xPos + x - 1, yPos - y);
	        // ���½�
	        genMaze(xPos + 1, yPos + 1, height - xPos + x - 1, width - yPos + y - 1);

	    }
	 
	  public int[][] returnArray(){
		  return blocked;
	  }
	 
	
	    
	    public void show() {
	    	for(int i=0;i<height+2;i++) {
	    		for(int j=0;j<width+2;j++) {
	    			System.out.print(blocked[i][j]+" ");
	    		}
	    		System.out.println("");
	    	}
	    }

		@Override
		public int[][] returnMaze() {
			// TODO Auto-generated method stub
			return blocked;
		}
	
	
}






/*
 * //���ٵ���ֵ�����ƴ�С��������ֵԽС��ͼԽ��,��ѭ�����ƿ�ȣ���ѭ�����Ƴ���
 * 
 * 
 * 				//���ļ���ֵ
				for(float x = 1.5f;x>-1.5f;x-=0.15f) {
					for(float y =-1.5f;y<1.5f;y+=0.15f) {
						float a=y*y+x*x-1;
						System.out.print((a*a*a)-(y*y*x*x*x)<=0.0f?"0 ":"1 ");
					}
					System.out.println("");
				}
				// 0.15-----21      2-1*0.1
				// 0.1 -----30
				//0.05------61
						1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
						1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
						1 1 1 1 1 1 0 0 0 1 1 1 0 0 0 1 1 1 1 1 1 
						1 1 1 1 0 0 0 0 0 0 1 0 0 0 0 0 0 1 1 1 1 
						1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 
						1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 
						1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 
						1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 
						1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 
						1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 
						1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 
						1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 
						1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 
						1 1 1 1 1 1 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 
						1 1 1 1 1 1 1 0 0 0 0 0 0 0 1 1 1 1 1 1 1 
						1 1 1 1 1 1 1 1 0 0 0 0 0 1 1 1 1 1 1 1 1 
						1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 
						1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
						1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
						1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
						1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
						
						
				
				
					//	(x*x+y*y-1)*(x*x+y*y-1)*(x*x+y*y-1)-x*x*y*y*y=0
	}

 * */

//����������״���Թ�
class makeSpecicalMap extends Cutmap{
	float reduceX;
	float reduceY;
	int m=0;
	public int x1=0;
	public int y1=0;
	public int x2=0;
	public int y2=0;
	ArrayList<String> stack;
	ArrayList<String> stack2=new ArrayList<String>();
	
	
	
	public makeSpecicalMap(float x, float y) {
		height=0;
		width=0;
		this.reduceX = 0.2f-(x*0.01f);
		this.reduceY = 0.2f-(y*0.01f);
		show();
		Initialize();
		makeMap();
	}
	//�浽����
	public void show(){
		//��ѭ�����ƿ�ȣ���ѭ�����Ƴ���
	
		for(float i = 1.5f;i>-1.5f;i-=reduceX) {
			width=0;
			for(float j =-1.5f;j<1.5f;j+=reduceY) {
				float a=j*j+i*i-1;
				System.out.print((a*a*a)-(j*j*i*i*i)<=0.0f?"0 ":"2 ");
				width++;
			}
			System.out.println("");
		height++;
	}
		
		System.out.println("");
		blocked = new int[height][width];

		height-=2;
		width-=2;
		int x=0;
		int y=0;
		for(float i = 1.5f;i>-1.5f;i-=reduceX) {
			 y=0;
			for(float j =-1.5f;j<1.5f;j+=reduceY) {
				float a=j*j+i*i-1;
				blocked[x][y]=(a*a*a)-(j*j*i*i*i)<=0.0f?0:2;
			y++;	
			}
		x++;
}
		
		
		for(int i=0;i<blocked.length;i++) {
			for(int j=0;j<blocked[0].length;j++) {
				System.out.print(blocked[i][j]+" ");
			}
			System.out.println("");
			}
		}
	
	//��ʼ������
	
	public void Initialize() {
		for(int i=1;i<blocked.length-1;i++) {
			for(int j=1;j<blocked[0].length-1;j++) {
				if(blocked[i][j]==0&&(blocked[i-1][j]!=2&&blocked[i+1][j]!=2&&blocked[i][j-1]!=2&&blocked[i][j+1]!=2)) {
					blocked[i][j]=1;
				}
			}
			
			}
		for(int i=0;i<blocked.length;i++) {
			for(int j=0;j<blocked[0].length;j++) {
				System.out.print(blocked[i][j]+" ");
			}
			System.out.println("");
			}
		
		}
	
	//���ɵ�ͼ
	public void makeMap() {
		for(int i=1;i<blocked.length-1;i++) {
			for(int j=1;j<blocked[0].length-1;j++) {
				if(j%2==0&&blocked[i][j]==1) {
					blocked[i][j]=0;
				}
			}
		}
		stack = new ArrayList<String>(); 
		
	for(int i=1;i<blocked.length-1;i++) {
		for(int j=1;j<blocked[0].length-1;j++) {
			if(blocked[i][j]==1) {
				stack.add(i+","+j);
			m++;
			}
		}
	}
	
	usePrim();
		
	}
	
	//prim
	public void usePrim() {
		Random random = new Random();
		String[] newcoord =new String[2];
		while(!stack.isEmpty()) {
			
			if(stack2.size()==m-1) {
				break;
			}
			int m = random.nextInt(stack.size());
			if(stack2.contains(stack.get(m))) {
				stack.remove(m);
				continue;
			}
			newcoord=stack.get(m).split(",", 2);
			
			int a = Integer.parseInt(newcoord[0]);
			int b = Integer.parseInt(newcoord[1]);
			if(stack2.isEmpty()) {
				stack2.add(a+","+b);
			}
			int n = random.nextInt(4);
			
			if(n==0) {
				if(blocked[a][b]==1&&blocked[a+2][b]==1&&(!stack2.contains((a+2)+","+b))) {
					blocked[a+1][b]=1;
					stack2.add((a+2)+","+b);
					stack.remove(m);
					continue;
				}
				
			}
			if(n==1) {
				 if(blocked[a][b]==1&&blocked[a][b+2]==1&&(!stack2.contains((a)+","+(b+2)))) {
						blocked[a][b+1]=1;
						stack2.add((a)+","+(b+2));
						stack.remove(m);
						continue;
					}
					
					 
			}
			if(n==2) {
				 if(blocked[a][b]==1&&blocked[a-2][b]==1&&(!stack2.contains((a-2)+","+b))) {
						blocked[a-1][b]=1;
						stack2.add((a-2)+","+b);
						stack.remove(m);
						continue;
					}
					
			}
			
			if(n==3) {
				  if(blocked[a][b]==1&&blocked[a][b+2]==1&&(!stack2.contains((a)+","+(b+1)))) {
						blocked[a][b+1]=1;
						stack2.add((a)+","+(b+2));
						stack.remove(m);
						continue;
					}
			
			}
			
		/*	if(blocked[a][b]==1&&blocked[a+2][b]==1&&(!stack2.contains((a+2)+","+b))) {
				blocked[a+1][b]=1;
				stack2.add((a+2)+","+b);
				stack.remove(m);
				continue;
			}
			
				 if(blocked[a][b]==1&&blocked[a][b+2]==1&&(!stack2.contains((a)+","+(b+2)))) {
				blocked[a][b+1]=1;
				stack2.add((a)+","+(b+2));
				stack.remove(m);
				continue;
			}
			
			 if(blocked[a][b]==1&&blocked[a-2][b]==1&&(!stack2.contains((a-2)+","+b))) {
				blocked[a-1][b]=1;
				stack2.add((a-2)+","+b);
				stack.remove(m);
				continue;
			}
			
		
		    if(blocked[a][b]==1&&blocked[a][b+2]==1&&(!stack2.contains((a)+","+(b+1)))) {
				blocked[a][b+1]=1;
				stack2.add((a)+","+(b+2));
				stack.remove(m);
				continue;
			}*/
			
			if(blocked[a][b]!=1||blocked[a+2][b]!=1||(stack2.contains((a+2)+","+b))||blocked[a-2][b]!=1||(stack2.contains((a-2)+","+b))
					||blocked[a][b+2]!=1||(stack2.contains((a)+","+(b+2)))||blocked[a][b+2]!=1||(stack2.contains((a)+","+(b+1)))
					) {
				stack.remove(m);
				continue;
			}
			
			
			
			
		}
		

		for(int i=0;i<blocked.length;i++) {
			if(x1!=0||y1!=0) {
				break;
			}
			for(int j=0;j<blocked[0].length;j++) {
				if(blocked[i][j]==1) {
					x1=i;
					y1=j;
					break;
					}
				}
			
			}
		for(int i =blocked.length-1;i>=0;i--) {
			if(x2!=0||y2!=0) {
				break;
			}
			for(int j=blocked[0].length-1;j>=0;j--) {
				if(blocked[i][j]==1) {
					x2=i;
					y2=j;
					break;
				}
			}
		}
		
		
		
		
		
		for(int i=0;i<blocked.length;i++) {
			for(int j=0;j<blocked[0].length;j++) {
				System.out.print(blocked[i][j]+" ");
			}
			System.out.println("");
			}
		
		}
		
		
	}

//�����ļ�
class IOopen extends Cutmap{
	
	
	public File file;

	public IOopen() {
		super();	
	}
	
	public IOopen(File file) {
		this.file = file;
		readIOtext();
	}
	
	public void readIOtext() {
		
		int [][]blocked1 =new int[40][40];
		BufferedReader in=null;
			try {
				
			in = new BufferedReader(new FileReader(file));
			
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}
			String readLine1 = null;
				int size=0,j=0;
			try {
				while((readLine1 = in.readLine()) != null) {
					String[] temp = readLine1.split(" ");
					size =temp.length;
					this.height = size-2;
					this.width= size-2;;
					for(int i=0;i<temp.length;i++) {
						blocked1[j][i]=Integer.parseInt(temp[i]);
					}
					j++;
				}
			
			blocked = new int[size][size];
			
			for(int i=0;i<size;i++) {
				for(int z=0;z<size;z++) {
					blocked[i][z]=blocked1[i][z];
				}
			}
			

			in.close();
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}


//�����Թ��ĳ�����
abstract class maze{
	abstract public int[][] returnMaze(); 
}




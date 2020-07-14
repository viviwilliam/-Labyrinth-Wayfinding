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
		backPane.setStyle("-fx-background-image:url(课程设计/backPhoto.jfif)");
		
		Pane topPane = new Pane();
		Image topName = new Image("课程设计/name.PNG");
		ImageView gameName = new ImageView(topName);
		topPane.getChildren().add(gameName);
		
		Image left = new Image("课程设计/图片1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		Image right = new Image("课程设计/图片2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		
		Image botton = new Image("课程设计/图片4_看图王.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		HBox bottomPane = new HBox(bottonPhoto);
		bottomPane.setPadding(new Insets(100, 0, 0, 250));
		
		
		VBox centerPane = new VBox(100);
		
		Image startGame1 = new Image("课程设计/关卡模式_看图王.png",130,130,true,true);
		ImageView startPhoto1 = new ImageView(startGame1);
		Button start1 = new Button("",startPhoto1);
		centerPane.setPadding(new Insets(20, 0, 0, 60));
	
		
		
		Image startGame2 = new Image("课程设计/练习模式_看图王.png",130,130,true,true);
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
		arg0.setTitle("解迷");
		arg0.show();
		
		//点击关卡模式切换到关卡游戏模式
		startGame hander1 = new startGame(arg0);
		start1.setOnAction(hander1);
		//点击切换到练习模式
		practiceGame hander2 = new practiceGame(arg0);
		start2.setOnAction(hander2);
		
		this.stage.close();
	}
	
}




//鼠标点击选项后进入练习模式
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
		backPane.setStyle("-fx-background-image:url(课程设计/backPhoto.jfif)");
		
		Pane topPane = new Pane();
		Image topName = new Image("课程设计/name.PNG");
		ImageView gameName = new ImageView(topName);
		topPane.getChildren().add(gameName);
		
		Image left = new Image("课程设计/图片1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		Image right = new Image("课程设计/图片2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		
		Image botton = new Image("课程设计/图片4_看图王.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		HBox bottomPane = new HBox(bottonPhoto);
		bottomPane.setPadding(new Insets(100, 0, 0, 250));
		
		
		VBox centerPane = new VBox(100);
		
		Image startGame1 = new Image("课程设计/正常图形_看图王.png",130,130,true,true);
		ImageView startPhoto1 = new ImageView(startGame1);
		Button start1 = new Button("",startPhoto1);
		centerPane.setPadding(new Insets(20, 0, 0, 60));
	
		Image startGame2 = new Image("课程设计/特殊图形_看图王.png",130,130,true,true);
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
		gameMenu.setTitle("解迷");
		gameMenu.show();
		
		this.stage.close();
	
		
		formalMap map = new formalMap(gameMenu);
		start1.setOnAction(map);
	
		
		Special special = new Special(gameMenu);
		start2.setOnAction(special);
	}
}

//正常图形模式
class formalMap implements EventHandler<ActionEvent>{
	//文本域
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
		
		backPane.setStyle("-fx-background-image:url(课程设计/timg.jpg)");
		
		Image topName = new Image("课程设计/name.PNG");
		ImageView gameName = new ImageView(topName);
		
		
		Image left = new Image("课程设计/图片1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		Image right = new Image("课程设计/图片2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		
		Image botton = new Image("课程设计/图片4_看图王.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		
		//设计中间游戏界面--------------------------------------------------------------------------------------------------
		GridPane hbox = new GridPane();
		
		ComboBox<Button> com = new ComboBox<Button>();
		com.setMinWidth(130);
		com.setMaxHeight(30);
		//com.setStyle("-fx-background-image:url(课程设计/生成迷宫_看图王.PNG)");
		Image img1 = new Image("课程设计/生成迷宫_看图王.PNG",130,130,true,true);
		Image img2 = new Image("课程设计/寻找路径_看图王.PNG",130,130,true,true);
		Image img3 = new Image("课程设计/遍历迷宫_看图王.PNG",130,130,true,true);
		Image img4 = new Image("课程设计/单步寻路_看图王.PNG",130,130,true,true);
		Image img5 = new Image("课程设计/重置迷宫_看图王.PNG",130,130,true,true);
		Image img6 = new Image("课程设计/选择迷宫_看图王.PNG",130,130,true,true);
		Image img7 = new Image("课程设计/退出_看图王.PNG",100,30,true,true);
		
		
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
		Button bt12 = new Button("递归切割");
		
		com.getItems().add(bt11);
		com.getItems().add(bt12);
		
		
		
		//HBox hbox = new HBox(15);
		//hbox.setAlignment(Pos.CENTER);
		//把button放到center的第零格
		hbox.addRow(0,bt1, bt2, bt3, bt4, bt5,bt6,bt7);
		hbox.setAlignment(Pos.CENTER);
		
	//设计中间游戏界面--------------------------------------------------------------------------------------------------
		
		//左侧
		VBox setXPos = new VBox();
		
		Xpos.setEditable(true);//可编辑
		
		Image heightName = new Image("课程设计/高度_看图王.PNG");
		ImageView hName = new ImageView(heightName);
		
		
		setXPos.getChildren().add(hName);
		setXPos.getChildren().add(Xpos);
		setXPos.getChildren().add(leftPhoto);
		setXPos.setAlignment(Pos.CENTER);
		
		//右侧
		VBox setYPos = new VBox();
		Ypos.setEditable(true);//可编辑
		Image widthName = new Image("课程设计/宽度_看图王.PNG");
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
		simpleGame.setTitle("正常模式");
		simpleGame.show();
		this.stage.close();
		
	//事件生成
		//点击buttom1 就生成地图
		bt1.setOnAction(e->{
			//随机使用prim和递归切割算法
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
		fileChooser.setInitialDirectory(new File("D:\\新建文件夹\\bin\\课程设计"));
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(simpleGame);
        System.out.println(file);
        IOopen iOopen =new IOopen(file);
        makemap(iOopen);
		});
	}	
	
	
	
	
	//遍历迷宫(内部类+多线程)
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
				
				//如果到达终点或者周围没路了，就出栈，退回上一个坐标
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
			
				
				//搜索周围的坐标，随机选取一个未在Visited的坐标，入栈
				if(Road1.peek()!=((thisMap.length-2)+","+(thisMap[0].length-2))&&(findAround(Road1.peek(),Visited1)
								||num[x1][y1]+1<num[x1-1][y1]
								||num[x1][y1]+1<num[x1][y1-1]
								||num[x1][y1]+1<num[x1][y1+1]
								||num[x1][y1]+1<num[x1+1][y1])) {
					newcoord=Road1.peek().split(",", 2);
					
					 x = Integer.parseInt(newcoord[0]);
					 y = Integer.parseInt(newcoord[1]);
					 
					 
					 
					//优先遍历右边
					if(thisMap[x][y+1]!=0&&(!Visited1.contains((x)+","+(y+1))||num[x][y]+1<num[x][y+1])) {
						Visited1.add(x+","+(y+1));
						Road1.push(x+","+(y+1));
						num[x][y+1]=num[x][y]+1;
						if((x!=(thisMap.length-2)||(y+1)!=(thisMap[0].length-2))&&(x!=1||(y+1)!=1)) {
						}
						continue;
					}
					//下面
					if(thisMap[x+1][y]!=0&&(!Visited1.contains((x+1)+","+(y))||num[x][y]+1<num[x+1][y])) {
						num[x+1][y]=num[x][y]+1;
						Visited1.add((x+1)+","+y);
						Road1.push((x+1)+","+y);
						if(((x+1)!=(thisMap.length-2)||(y)!=(thisMap[0].length-2))&&((x+1)!=1||(y)!=1)) {
						}
						continue;
					}
					
					//左边
					if(thisMap[x][y-1]!=0&&(!Visited1.contains((x)+","+(y-1))||num[x][y]+1<num[x][y-1])) {
						num[x][y-1]=num[x][y]+1;
						Visited1.add(x+","+(y-1));
						Road1.push(x+","+(y-1));
						if((x!=(thisMap.length-2)||(y-1)!=(thisMap[0].length-2))&&(x!=1||(y-1)!=1)) {
						}
						continue;
					}
					
					//上面
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
		System.out.println("遍历结束");
//		Image map ;
//		ImageView mapPhoto2;
//		double len = (500/(thisMap.length)) > (500/(thisMap[0].length)) ? (500/(thisMap.length)) : (500/(thisMap[0].length));
//
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				if(num[i][j]!=0) {
//					map = new Image("课程设计/1.PNG",len,len,true,true);
//					mapPhoto2 = new ImageView(map);
//					vbox.add( mapPhoto2, j, i);
//				}
//					
//			}
//		}
		
		
		//遍历结束
		
	
	}
	


	public void Traverse() {
		Image map ;
		ImageView mapPhoto2;
		double len = (500/(thisMap.length)) > (500/(thisMap[0].length)) ? (500/(thisMap.length)) : (500/(thisMap[0].length));

		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(thisMap[i][j]!=0) {
					map = new Image("课程设计/动物脚印右.PNG",len,len,true,true);
					mapPhoto2 = new ImageView(map);
					vbox.add( mapPhoto2, j, i);
					}
				}
			}
	}	
	
	
	
	
	//单步寻路
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
			
			//如果到达终点或者周围没路了，就出栈，退回上一个坐标
			if(Road1.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))||(!findAround(Road1.peek(),Visited1)
					&&(num[x1][y1]+1>=num[x1-1][y1]
					&&num[x1][y1]+1>=num[x1][y1-1]
					&&num[x1][y1]+1>=num[x1][y1+1]
					&&num[x1][y1]+1>=num[x1+1][y1]))) {
				if(!findAround(Road1.peek(),Visited1)&&!Road1.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))&&!Road1.peek().equals(1+","+1)) {
				newcoord=Road1.peek().split(",", 2);
				x = Integer.parseInt(newcoord[0]);
				y = Integer.parseInt(newcoord[1]);
				map = new Image("课程设计/1.PNG",len,len,true,true);
				mapPhoto2 = new ImageView(map);
				vbox.add( mapPhoto2, y, x);
				}
				Road1.pop();
			}
		
			
			//搜索周围的坐标，随机选取一个未在Visited的坐标，入栈
			if(Road1.peek()!=((thisMap.length-2)+","+(thisMap[0].length-2))&&(findAround(Road1.peek(),Visited1)
							||num[x1][y1]+1<num[x1-1][y1]
							||num[x1][y1]+1<num[x1][y1-1]
							||num[x1][y1]+1<num[x1][y1+1]
							||num[x1][y1]+1<num[x1+1][y1])) {
				newcoord=Road1.peek().split(",", 2);
				
				 x = Integer.parseInt(newcoord[0]);
				 y = Integer.parseInt(newcoord[1]);
				 
				 
				 
				//优先遍历右边
				if(thisMap[x][y+1]!=0&&(!Visited1.contains((x)+","+(y+1))||num[x][y]+1<num[x][y+1])) {
					Visited1.add(x+","+(y+1));
					Road1.push(x+","+(y+1));
					num[x][y+1]=num[x][y]+1;
					if((x!=(thisMap.length-2)||(y+1)!=(thisMap[0].length-2))&&(x!=1||(y+1)!=1)) {
					map = new Image("课程设计/动物脚印右.PNG",len,len,true,true);
					mapPhoto2 = new ImageView(map);
					vbox.add( mapPhoto2, y+1, x);
					}
					return;
				}
				//下面
				if(thisMap[x+1][y]!=0&&(!Visited1.contains((x+1)+","+(y))||num[x][y]+1<num[x+1][y])) {
					num[x+1][y]=num[x][y]+1;
					Visited1.add((x+1)+","+y);
					Road1.push((x+1)+","+y);
					if(((x+1)!=(thisMap.length-2)||(y)!=(thisMap[0].length-2))&&((x+1)!=1||(y)!=1)) {
					map = new Image("课程设计/动物脚印下.PNG",len,len,true,true);
					mapPhoto2 = new ImageView(map);
					vbox.add( mapPhoto2, y, x+1);
					}
					return;
				}
				
				//左边
				if(thisMap[x][y-1]!=0&&(!Visited1.contains((x)+","+(y-1))||num[x][y]+1<num[x][y-1])) {
					num[x][y-1]=num[x][y]+1;
					Visited1.add(x+","+(y-1));
					Road1.push(x+","+(y-1));
					if((x!=(thisMap.length-2)||(y-1)!=(thisMap[0].length-2))&&(x!=1||(y-1)!=1)) {
					map = new Image("课程设计/动物脚印左.PNG",len,len,true,true);
					mapPhoto2= new ImageView(map);
					vbox.add( mapPhoto2, y-1, x);
					}
					return;
				}
				
				//上面
				if(thisMap[x-1][y]!=0&&(!Visited1.contains((x-1)+","+(y))||num[x][y]+1<num[x-1][y])) {
					num[x-1][y]=num[x][y]+1;
					Visited1.add((x-1)+","+y);
					Road1.push((x-1)+","+y);
					if(((x-1)!=(thisMap.length-2)||(y)!=(thisMap[0].length-2))&&((x-1)!=1||(y)!=1)) {
					map = new Image("课程设计/动物脚印上.PNG",len,len,true,true);
					mapPhoto2= new ImageView(map);
					vbox.add( mapPhoto2, y, x-1);
					}
					return;
				}
				
			}
			
		}
	}
	
	
	
	
	
	
	//每走一步权值在之前基础加一，寻找栈顶元素的下一个可访问的相邻结点，
	//条件就是栈顶元素的权值加1必须小于下一个节点的权值或者下一个节点未被访问过
	//寻找最短路径(深度优先遍历加回溯)
	public void findMin() {
		
		
		//存储每个结点的权值
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
			//如果已经到达了,将栈内元素存到存到可变长数组	
			String[] newcoord1 =new String[2];
			newcoord1=Road.peek().split(",", 2);
			
			int x1 = Integer.parseInt(newcoord1[0]);
			int y1 = Integer.parseInt(newcoord1[1]);
			
			if(Road.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))){
				stack= new Stack<String>();
				//深度复制
				for(int i=0;i<Road.size();i++) {
					stack.push(Road.get(i));
				}
				
				findRoad.add(stack);
			}
			//如果到达终点或者周围没路了，就出栈，退回上一个坐标
			if(Road.peek().equals(((thisMap.length-2)+","+(thisMap[0].length-2)))||(!findAround(Road.peek(),Visited)
					&&(num[x1][y1]+1>=num[x1-1][y1]
							&&num[x1][y1]+1>=num[x1][y1-1]
							&&num[x1][y1]+1>=num[x1][y1+1]
							&&num[x1][y1]+1>=num[x1+1][y1]))) {
				Road.pop();
				continue;
			}
			//搜索周围的坐标，随机选取一个未在Visited的坐标，入栈
		
			
			while(Road.peek()!=((thisMap.length-2)+","+(thisMap[0].length-2))&&(findAround(Road.peek(),Visited)
					||num[x1][y1]+1<num[x1-1][y1]
					||num[x1][y1]+1<num[x1][y1-1]
					||num[x1][y1]+1<num[x1][y1+1]
					||num[x1][y1]+1<num[x1+1][y1])) {
				String[] newcoord =new String[2];
				newcoord=Road.peek().split(",", 2);
				
				int x = Integer.parseInt(newcoord[0]);
				int y = Integer.parseInt(newcoord[1]);
				//优先遍历右边
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
		//找出最短路径
		
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
		
		//获得最短路径的坐标
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
			//height不变，width加一   向右
			if(minRode[0][i]==minRode[0][i+1]&&minRode[1][i+1]==minRode[1][i]+1) {
				map[minRode[0][i]][minRode[1][i]] = new Image("课程设计/动物脚印右.PNG",len,len,true,true);
				
			}
			//height不变，width减一  向左
			if(minRode[0][i]==minRode[0][i+1]&&minRode[1][i+1]==minRode[1][i]-1) {
				map[minRode[0][i]][minRode[1][i]] = new Image("课程设计/动物脚印左.PNG",len,len,true,true);
				
			}
				
			//width不变，height加一 向下
			if(minRode[1][i]==minRode[1][i+1]&&minRode[0][i+1]==minRode[0][i]+1) {
				map[minRode[0][i]][minRode[1][i]] = new Image("课程设计/动物脚印下.PNG",len,len,true,true);
				
			}	
			//width不变，height减一  向上
			if(minRode[1][i]==minRode[1][i+1]&&minRode[0][i+1]==minRode[0][i]-1) {
				map[minRode[0][i]][minRode[1][i]] = new Image("课程设计/动物脚印上.PNG",len,len,true,true);
				
			}
			 mapPhoto[minRode[0][i]][minRode[1][i]] = new ImageView(map[minRode[0][i]][minRode[1][i]]);
			 
			 vbox.add( mapPhoto[minRode[0][i]][minRode[1][i]], minRode[1][i], minRode[0][i]);
		}
		
		
	}
	//判断一下这个坐标周围是否已经全部访问
	public boolean findAround(String str,ArrayList<String> array) {
		
		boolean isWallAll = false;
		
		int x1=0;
		int y1=0;
		
		//把X和Y的值从字符串里面取出来
		
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
	
	
	//重置迷宫
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
	
	//生成迷宫(图片形式)
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
						 map[i][j] = new Image("课程设计/2.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					  if(cutmap.returnMaze()[i][j]==1) {
						 map[i][j] = new Image("课程设计/1.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					
					 if(i==1&&j==1) {
						 map[i][j] = new Image("课程设计/角色一.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					 
					 if(i==cutmap.returnMaze().length-2&&j==cutmap.returnMaze().length-2) {
						 map[i][j] = new Image("课程设计/终点1.png",len,len,true,true);
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
	
	
	
	//文本框生成迷宫
	public void getHeiAndWid(int size) {
		int height = 0;
		int width  = 0;
		try {
			//获取输入的长和宽
		height = Integer.parseInt(Xpos.getText());
		width = Integer.parseInt(Ypos.getText());
		}
		catch(Exception ex) {
			Stage tip = new Stage();
			HBox pane = new HBox();
			Text text = new Text("请输入数字"); 
			pane.getChildren().add(text);
			pane.setAlignment(Pos.CENTER);
			Scene scene = new Scene(pane);
			tip.setScene(scene);
			tip.setHeight(100);
			tip.setWidth(250);
			tip.setResizable(false);
			tip.setTitle("警告");
			tip.show();
		}
		
		if(height!=0&&width!=0) {
			
			maze cutmap = null ;
			
			//将地图放到中间
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



//鼠标点击选项后进入游戏界面
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
		backPane.setStyle("-fx-background-image:url(课程设计/backPhoto.jfif)");
		
		Pane topPane = new Pane();
		Image topName = new Image("课程设计/name.PNG");
		ImageView gameName = new ImageView(topName);
		topPane.getChildren().add(gameName);
		
		Image left = new Image("课程设计/图片1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		Image right = new Image("课程设计/图片2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		
		Image botton = new Image("课程设计/图片4_看图王.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		HBox bottomPane = new HBox(bottonPhoto);
		bottomPane.setPadding(new Insets(100, 0, 0, 250));
		
		
		VBox centerPane = new VBox(100);
		
		Image startGame1 = new Image("课程设计/简单模式_看图王.png",130,130,true,true);
		ImageView startPhoto1 = new ImageView(startGame1);
		Button start1 = new Button("",startPhoto1);
		centerPane.setPadding(new Insets(20, 0, 0, 60));
	
		Image startGame2 = new Image("课程设计/困难模式.png",130,130,true,true);
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
		gameMenu.setTitle("解迷");
		gameMenu.show();
		
		this.stage.close();
	
		
		SimpleMap map = new SimpleMap(gameMenu);
		start1.setOnAction(map);
	}
	
}

//特殊图形模式
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
				
				backPane.setStyle("-fx-background-image:url(课程设计/timg.jpg)");
				
				Image topName = new Image("课程设计/name.PNG");
				ImageView gameName = new ImageView(topName);
				
				
				Image left = new Image("课程设计/图片1.png",150,200,true,true);
				ImageView leftPhoto = new ImageView(left);
				
				Image right = new Image("课程设计/图片2.png",150,200,true,true);
				ImageView rightPhoto = new ImageView(right);
				
				
				Image botton = new Image("课程设计/图片4_看图王.png",300,300,true,true);
				ImageView bottonPhoto = new ImageView(botton);
				
				//设计中间游戏界面--------------------------------------------------------------------------------------------------
				GridPane hbox = new GridPane();
				
				
				Image img1 = new Image("课程设计/心形迷宫_看图王.PNG",130,130,true,true);
				Image img2 = new Image("课程设计/寻找路径_看图王.PNG",130,130,true,true);
				Image img3 = new Image("课程设计/遍历迷宫_看图王.PNG",130,130,true,true);
				Image img4 = new Image("课程设计/单步寻路_看图王.PNG",130,130,true,true);
				Image img5 = new Image("课程设计/重置迷宫_看图王.PNG",130,130,true,true);
				Image img6 = new Image("课程设计/其他迷宫_看图王.PNG",130,130,true,true);
				Image img7 = new Image("课程设计/退出_看图王.PNG",100,30,true,true);
				
				
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
				//把button放到center的第零格
				hbox.addRow(0,bt1, bt2, bt3, bt4, bt5,bt6,bt7);
				hbox.setAlignment(Pos.CENTER);
				
			//设计中间游戏界面--------------------------------------------------------------------------------------------------
				
				//左侧
				VBox setXPos = new VBox();
				
				Xpos.setEditable(true);//可编辑
				
				Image heightName = new Image("课程设计/高度_看图王.PNG");
				ImageView hName = new ImageView(heightName);
				
				
				setXPos.getChildren().add(hName);
				setXPos.getChildren().add(Xpos);
				setXPos.getChildren().add(leftPhoto);
				setXPos.setAlignment(Pos.CENTER);
				
				//右侧
				VBox setYPos = new VBox();
				Ypos.setEditable(true);//可编辑
				Image widthName = new Image("课程设计/宽度_看图王.PNG");
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
				simpleGame.setTitle("正常模式");
				simpleGame.show();
				this.stage.close();
				
				
				
			//事件生成
				//点击buttom1 就生成地图
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
		
		//把X和Y的值从字符串里面取出来
		
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
	
	
	//存储每个结点的权值
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
		//如果已经到达了,将栈内元素存到存到可变长数组	
		String[] newcoord1 =new String[2];
		newcoord1=Road.peek().split(",", 2);
		
		int x1 = Integer.parseInt(newcoord1[0]);
		int y1 = Integer.parseInt(newcoord1[1]);
		
		if(Road.peek().equals(((x2)+","+(y2)))){
			stack= new Stack<String>();
			//深度复制
			for(int i=0;i<Road.size();i++) {
				stack.push(Road.get(i));
			}
			
			findRoad.add(stack);
		}
		//如果到达终点或者周围没路了，就出栈，退回上一个坐标
		if(Road.peek().equals(((x2)+","+(y2)))||(!findAround(Road.peek(),Visited)
				&&(num[x1][y1]+1>=num[x1-1][y1]
						&&num[x1][y1]+1>=num[x1][y1-1]
						&&num[x1][y1]+1>=num[x1][y1+1]
						&&num[x1][y1]+1>=num[x1+1][y1]))) {
			Road.pop();
			continue;
		}
		//搜索周围的坐标，随机选取一个未在Visited的坐标，入栈
	
		
		while(Road.peek()!=((x2)+","+(y2))&&(findAround(Road.peek(),Visited)
				||num[x1][y1]+1<num[x1-1][y1]
				||num[x1][y1]+1<num[x1][y1-1]
				||num[x1][y1]+1<num[x1][y1+1]
				||num[x1][y1]+1<num[x1+1][y1])) {
			String[] newcoord =new String[2];
			newcoord=Road.peek().split(",", 2);
			
			int x = Integer.parseInt(newcoord[0]);
			int y = Integer.parseInt(newcoord[1]);
			//优先遍历右边
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
		//找出最短路径
		
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
		
		//获得最短路径的坐标
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
			//height不变，width加一   向右
			if(minRode[0][i]==minRode[0][i+1]&&minRode[1][i+1]==minRode[1][i]+1) {
				rectangles[minRode[0][i]][minRode[1][i]].setFill(Color.AQUAMARINE);
				
			}
			//height不变，width减一  向左
			if(minRode[0][i]==minRode[0][i+1]&&minRode[1][i+1]==minRode[1][i]-1) {
				rectangles[minRode[0][i]][minRode[1][i]].setFill(Color.AQUAMARINE);
				
			}
				
			//width不变，height加一 向下
			if(minRode[1][i]==minRode[1][i+1]&&minRode[0][i+1]==minRode[0][i]+1) {
				rectangles[minRode[0][i]][minRode[1][i]].setFill(Color.AQUAMARINE);
				
			}	
			//width不变，height减一  向上
			if(minRode[1][i]==minRode[1][i+1]&&minRode[0][i+1]==minRode[0][i]-1) {
				rectangles[minRode[0][i]][minRode[1][i]].setFill(Color.AQUAMARINE);
				
			}
		}
		
		
	}
}
	
	//心形单步寻路
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
					
					//如果到达终点或者周围没路了，就出栈，退回上一个坐标
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
				
					
					//搜索周围的坐标，随机选取一个未在Visited的坐标，入栈
					if(Road1.peek()!=((thisMap.length-2)+","+(thisMap[0].length-2))&&(findAround1(Road1.peek(),Visited1)
									||num[x1][y1]+1<num[x1-1][y1]
									||num[x1][y1]+1<num[x1][y1-1]
									||num[x1][y1]+1<num[x1][y1+1]
									||num[x1][y1]+1<num[x1+1][y1])) {
						newcoord=Road1.peek().split(",", 2);
						
						 x = Integer.parseInt(newcoord[0]);
						 y = Integer.parseInt(newcoord[1]);
						 
						 
						 
						//优先遍历右边
						if(thisMap[x][y+1]!=0&&(!Visited1.contains((x)+","+(y+1))||num[x][y]+1<num[x][y+1])) {
							Visited1.add(x+","+(y+1));
							Road1.push(x+","+(y+1));
							num[x][y+1]=num[x][y]+1;
							if((x!=(x2)||(y+1)!=(y2))&&(x!=x1||(y+1)!=y1)) {
								rectangles[x][y+1].setFill(Color.AQUAMARINE);
							}
							return;
						}
						//下面
						if(thisMap[x+1][y]!=0&&(!Visited1.contains((x+1)+","+(y))||num[x][y]+1<num[x+1][y])) {
							num[x+1][y]=num[x][y]+1;
							Visited1.add((x+1)+","+y);
							Road1.push((x+1)+","+y);
							if(((x+1)!=(x2)||(y)!=(y2))&&((x+1)!=x1||(y)!=y1)) {
								rectangles[x+1][y].setFill(Color.AQUAMARINE);
							}
							return;
						}
						
						//左边
						if(thisMap[x][y-1]!=0&&(!Visited1.contains((x)+","+(y-1))||num[x][y]+1<num[x][y-1])) {
							num[x][y-1]=num[x][y]+1;
							Visited1.add(x+","+(y-1));
							Road1.push(x+","+(y-1));
							if((x!=(x2)||(y-1)!=(y2))&&(x!=x1||(y-1)!=y1)) {
								rectangles[x][y-1].setFill(Color.AQUAMARINE);
							}
							return;
						}
						
						//上面
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
		
		
	
	//特殊图形生成
		public void getHeiAndWidspecial() {
			int height = 0;
			int width  = 0;
			try {
				//获取输入的长和宽
			height = Integer.parseInt(Xpos.getText());
			width = Integer.parseInt(Ypos.getText());
			}
			catch(Exception ex) {
				Stage tip = new Stage();
				HBox pane = new HBox();
				Text text = new Text("请输入数字"); 
				pane.getChildren().add(text);
				pane.setAlignment(Pos.CENTER);
				Scene scene = new Scene(pane);
				tip.setScene(scene);
				tip.setHeight(100);
				tip.setWidth(250);
				tip.setResizable(false);
				tip.setTitle("警告");
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
				//将地图放到中间
				
				 //Cutmap cutmap = new Cutmap(height,width);
				// cutmap.show();
				
				makeHeartMap heartMap = new makeHeartMap();
				Thread thread = new Thread(heartMap);
				thread.start(); 
			}
		}
		
		//多线程生成地图
	class makeHeartMap implements Runnable {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			makemapByColor();
		}
		
	}
	
	
	
	//生成迷宫（改变颜色形式）
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

















//简单模式生成地图，递归分割法
//关卡模式，让用户控制原始的人物上下左右移动，如果能够走到终点就判定为胜利，地图进一步复杂，一直到50*50；
//图片为玩家自主选择（可以尝试）
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
		backPane.setStyle("-fx-background-image:url(课程设计/timg.jpg)");
		
		Image topName = new Image("课程设计/name.PNG");
		ImageView gameName = new ImageView(topName);
		//设置左侧--------------------------------------------------------------------
		
		//左侧
		VBox setXPos = new VBox();
		
		Image img1 = new Image("课程设计/玩家一_看图王.PNG",130,130,true,true);
		ImageView leftimg = new ImageView(img1);
		
		Button choose1 = new Button("",leftimg);
		choose1.setFocusTraversable(false);
		
		Image left = new Image("课程设计/图片1.png",150,200,true,true);
		ImageView leftPhoto = new ImageView(left);
		
		setXPos.getChildren().add(choose1);
		setXPos.getChildren().add(leftPhoto);
		setXPos.setAlignment(Pos.CENTER);
		
		
		
	//------------------------------------------------------------------------------------
	//设置右侧-----------------------------------------------------------------------------
		
		VBox setYPos = new VBox();
		
		Image img2 = new Image("课程设计/玩家二_看图王.PNG",130,130,true,true);
		ImageView rightimg = new ImageView(img2);
		
		Button choose2 = new Button("",rightimg);
		choose2.setFocusTraversable(false);
		
		Image right = new Image("课程设计/图片2.png",150,200,true,true);
		ImageView rightPhoto = new ImageView(right);
		
		setYPos.getChildren().add(choose2);
		setYPos.getChildren().add(rightPhoto);
		setYPos.setAlignment(Pos.CENTER);
	//-----------------------------------------------------------------------------------------------------	
		
		Image botton = new Image("课程设计/图片4_看图王.png",300,300,true,true);
		ImageView bottonPhoto = new ImageView(botton);
		
		//设计中间游戏界面--------------------------------------------------------------------------------------------------
		
		
		
		
		
		
		//居中
		BorderPane.setAlignment(bottonPhoto, Pos.CENTER);
		BorderPane.setAlignment(rightPhoto, Pos.CENTER);
		BorderPane.setAlignment(leftPhoto, Pos.CENTER);
		BorderPane.setAlignment(gameName, Pos.CENTER);
		
		//添加图片
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
		simpleGame.setTitle("简单模式");
		simpleGame.show();
		vbox.requestFocus();
		this.stage.close();
		
		
		//事件发生--------------------------------------------
		
		choose1.setOnAction(e->PlayerOne());
		choose2.setOnAction(e->Playertwo());
	}	
	
	//键盘控制
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
				map[x][y] = new Image("课程设计/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 x+=1;
				 map1[x][y] = new Image("课程设计/角色二.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		case UP:
			if(thisMap[x-1][y]!=0) {
				map[x][y] = new Image("课程设计/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 x-=1;
				 map1[x][y] = new Image("课程设计/角色二.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);		
			}
			break;
		case LEFT:
			if(thisMap[x][y-1]!=0) {
				map[x][y] = new Image("课程设计/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 y-=1;
				 map1[x][y] = new Image("课程设计/角色二.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		case RIGHT:
			if(thisMap[x][y+1]!=0) {
				map[x][y] = new Image("课程设计/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 y+=1;
				 map1[x][y] = new Image("课程设计/角色二.PNG",len,len,true,true);
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
			Text text = new Text("是否继续游戏"); 
			Button button1 = new Button("继续");
			Button button2 = new Button("退出");
			pane.getChildren().add(text);
			pane.getChildren().add(button1);
			pane.getChildren().add(button2);
			pane.setAlignment(Pos.CENTER);
			Scene scene = new Scene(pane);
			tip.setScene(scene);
			tip.setHeight(100);
			tip.setWidth(250);
			tip.setResizable(false);
			tip.setTitle("提示");
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
				map[x][y] = new Image("课程设计/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 x+=1;
				 map1[x][y] = new Image("课程设计/角色一.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		case UP:
			if(thisMap[x-1][y]!=0) {
				map[x][y] = new Image("课程设计/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 x-=1;
				 map1[x][y] = new Image("课程设计/角色一.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);		
			}
			break;
		case LEFT:
			if(thisMap[x][y-1]!=0) {
				map[x][y] = new Image("课程设计/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 y-=1;
				 map1[x][y] = new Image("课程设计/角色一.PNG",len,len,true,true);
				 mapPhoto1[x][y] = new ImageView(map1[x][y]);
				 vbox.add(mapPhoto1[x][y], y, x);	
			}
			break;
		case RIGHT:
			if(thisMap[x][y+1]!=0) {
				map[x][y] = new Image("课程设计/1.PNG",len,len,true,true);
				 mapPhoto[x][y] = new ImageView(map[x][y]);
				 vbox.add(mapPhoto[x][y], y, x);
				 y+=1;
				 map1[x][y] = new Image("课程设计/角色一.PNG",len,len,true,true);
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
			Text text = new Text("是否继续游戏"); 
			Button button1 = new Button("继续");
			Button button2 = new Button("退出");
			pane.getChildren().add(text);
			pane.getChildren().add(button1);
			pane.getChildren().add(button2);
			pane.setAlignment(Pos.CENTER);
			Scene scene = new Scene(pane);
			tip.setScene(scene);
			tip.setHeight(100);
			tip.setWidth(250);
			tip.setResizable(false);
			tip.setTitle("提示");
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
	
	
	
	//选择了玩家一并开始游戏
	public void PlayerOne() {
		
		
		Cutmap cutmap = new Cutmap(nativeHeight,nativeWidth);
		double len = (600/(cutmap.height+2)) < (600/(cutmap.width+2)) ? (600/(cutmap.height+2)) : (600/(cutmap.width+2));
		
		
		
		makemap(cutmap);
		KeyBoardControl();
	}
	
	//选择了玩家二并开始游戏
		public void Playertwo() {
			

			
			Cutmap cutmap = new Cutmap(nativeHeight,nativeWidth);
			double len = (600/(cutmap.height+2)) < (600/(cutmap.width+2)) ? (600/(cutmap.height+2)) : (600/(cutmap.width+2));
			
			Image img1 = new Image("课程设计/角色一.PNG",len,len,true,true);
			ImageView leftimg = new ImageView(img1);
			
			makemap2(cutmap);
			KeyBoardControl2();
		}
	
	//生成迷宫
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
						 map[i][j] = new Image("课程设计/2.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					  if(cutmap.blocked[i][j]==1) {
						 map[i][j] = new Image("课程设计/1.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					
					 if(i==1&&j==1) {
						 Image img1 = new Image("课程设计/角色二.PNG",len,len,true,true);
							ImageView leftimg = new ImageView(img1);
						 vbox.add(leftimg, j, i);
					 }
					 
					 if(i==cutmap.height&&j==cutmap.width) {
						 map[i][j] = new Image("课程设计/终点1.png",len,len,true,true);
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
						 map[i][j] = new Image("课程设计/2.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					  if(cutmap.blocked[i][j]==1) {
						 map[i][j] = new Image("课程设计/1.PNG",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }
					
					 if(i==1&&j==1) {
						 Image img1 = new Image("课程设计/角色一.PNG",len,len,true,true);
							ImageView leftimg = new ImageView(img1);
						 vbox.add(leftimg, j, i);
					 }
					 
					 if(i==cutmap.height&&j==cutmap.width) {
						 map[i][j] = new Image("课程设计/终点1.png",len,len,true,true);
						 mapPhoto[i][j] = new ImageView(map[i][j]);
						 vbox.add(mapPhoto[i][j], j, i);
					 }	 
				 }
				 System.out.println("");
			 }
			 
			 
			 thisMap=cutmap.blocked;
	}
	
	
	

	

	
	
	
}
//------------------------------------------------------------游戏算法部分----------------------------------------------
class prim extends maze{
	public int height;
	public int width;
	//存放地图
	public int [][] maps;
	//存放未打成通路的洞
	private ArrayList<String> saveRoll = new ArrayList<String>(); 
	//存放已经访问过的点
	private ArrayList<String> Roll = new ArrayList<String>(); 
	//随机数
	private Random ran = new Random();
	
	public prim(int height,int width) {
		this.height = 2*height+1;
		this.width = 2*width+1;
		maps = new int[this.height][this.width];
		MadeMap();
	}
	
	//初始化
	//0为墙，1为洞
	public void MadeMap() {
		
		//四周为墙
		for(int i=0;i<width;i++) {
			//上
			maps[0][i]=0;
			//底
			maps[height-1][i]=0;
		}
		//左右侧
		for(int i=0;i<height;i++) {
			maps[i][0]=0;
			maps[i][width-1]=0;
		}
		
		//中间迷宫部分初始化
		for(int i=1;i<this.height-1;i++) {
			for(int j=1;j<this.width-1;j++) {
				//偶数行设成墙壁
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
		//输出看一下
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print(maps[i][j]+" ");
			}
			System.out.println("");
		}
		
		//将地图中的路存到一个可变长数组中，然后开始的时候随机从中选取一个位置
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(maps[i][j]==1) {
					saveRoll.add(i+","+j);
				}
			}
		}
		//输出看一下
		for(int i=0;i<saveRoll.size();i++) {
			System.out.println(saveRoll.get(i));
		}
		//随机选取一个坐标
		int start;
		 start = ran.nextInt(saveRoll.size());
		 
		 String [] start1; 
		 //将坐标存到start1中
		 start1 = saveRoll.get(start).split(",");
		 int x1 = Integer.parseInt(start1[0]);
		 int y1 = Integer.parseInt(start1[1]);
		 
		 //进行开洞
		 openADoor(x1,y1);
		 
		 
		 //输出看效果
		 for(int i=0;i<maps.length;i++) {
			 for(int j=0;j<maps[i].length;j++) {
				 System.out.print(maps[i][j]+" ");
			 }
			 System.out.println("");
		 }
		 
	}
	
	//进行开洞
	public void openADoor(int x,int y) {
		//如果他在边界，就向不越界的地方开洞
		//如果他不在边界，就随机一个方向
		//然后判定那个方向跟他距离为二的是否是洞
		//如果是洞就两个连接着中间的墙成为一个通路，并把上一个节点移除，自动成为下一个节点
		//如果不是就随机其他位置，直到把周围四个点都循环完
		//随机选定开洞的位置(0,1,2,3)分别代表四个方向
		
		
		
		
		if(saveRoll.size()==1) {
			return;
		}
		
		
		int open = ran.nextInt(4);
		
		
		//上边界并且开洞位置为上
		if(x==1&&open==0) {
			open=2;
		}
		//左边界并且开洞位置为左
		if(y==1&&open==3) {
			open=1;
		}	
		//右边界并且开洞位置为右
		if(y==(this.width-2)&&open==1) {
			open=3;
		}	
		//下边界并且开洞位置为下
		if(x==(this.height-2)&&open==2) {
			open=0;
		}
		
		//上面判定
		//x-2
		if(open==0) {
			if(saveRoll.contains((x-2)+","+y))
			{
				//把两洞之间的墙打通
				this.maps[x-1][y]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x-2,y);
			}
			//右面判定
			if((y+2)<=(this.width-1)&&saveRoll.contains(x+","+(y+2))) {

				//把两洞之间的墙打通
				this.maps[x][y+1]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x,y+2);
			}
			//下面判定
			if((x+2)<=(this.height-1)&&saveRoll.contains((x+2)+","+y)) {
				//把两洞之间的墙打通
				this.maps[x+1][y]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x+2,y);
			}
			//左面判定
			if((y-2)>=0&&saveRoll.contains(x+","+(y-2))) {
				//把两洞之间的墙打通
				this.maps[x][y-1]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x,y-2);
			}	
			
			
		}
		//右面判定
		//y+2
		else if(open==1) {
			if(saveRoll.contains(x+","+(y+2)))
			{
				//把两洞之间的墙打通
				this.maps[x][y+1]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x,y+2);
			}
			
			//下面判定
			if((x+2)<=(this.height-1)&&saveRoll.contains((x+2)+","+y)) {
				//把两洞之间的墙打通
				this.maps[x+1][y]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x+2,y);
			}
			//左面判定
			if((y-2)>=0&&saveRoll.contains(x+","+(y-2))) {
				//把两洞之间的墙打通
				this.maps[x][y-1]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x,y-2);
			}	
			
		}
		
		
		
		//下面判定
		//x+2 
		else if(open==2) {
			if(saveRoll.contains((x+2)+","+y))
			{
				//把两洞之间的墙打通
				this.maps[x+1][y]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x+2,y);
			}
			
			//左面判定
			if((y-2)>=0&&saveRoll.contains(x+","+(y-2))) {
				//把两洞之间的墙打通
				this.maps[x][y-1]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x,y-2);
			}	
			
			//上面判定
			if((x-2)>=0&&saveRoll.contains((x-2)+","+y)) {
				//把两洞之间的墙打通
				this.maps[x-1][y]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x-2,y);
			}
			//右面判定
			if((y+2)<=(this.width-1)&&saveRoll.contains(x+","+(y+2))) {
				//把两洞之间的墙打通
				this.maps[x][y+1]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x,y+2);
			}
		}
		//左面判定
		//y-2
		else if(open==3) {
			if(saveRoll.contains((x-2)+","+y))
			{
				//把两洞之间的墙打通
				this.maps[x][y-1]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x,y-2);
			}
			
			//上面判定
			if((x-2)>=0&&saveRoll.contains((x-2)+","+y)) {
				//把两洞之间的墙打通
				this.maps[x-1][y]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x-2,y);
			}
			
			//右面判定
			if((y+2)<=(this.width-1)&&saveRoll.contains(x+","+(y+2))) {
				//把两洞之间的墙打通
				this.maps[x][y+1]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x,y+2);
			}
			//下面判定
			if((x+2)<=(this.height-1)&&saveRoll.contains((x+2)+","+y)) {
				//把两洞之间的墙打通
				this.maps[x+1][y]=1;
				//添加到已访问列表
				Roll.add(x+","+y);
				//移除掉当前的坐标
				saveRoll.remove(x+","+y);
				//当前设置成下一位的坐标
				openADoor(x+2,y);
			}
		}
		
		saveRoll.remove(x+","+y);
		
		
		
		//如果四周都打通了，就从已经访问过的点中随机选取一个
		
			int openNew = ran.nextInt(Roll.size());
			String [] start1; 
			 //将坐标存到openNew中
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



//递归切割法生成地图
class Cutmap extends maze{
	//0为墙，1为路
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
	
	//初始化
	private void Initialize() {
		
		for(int i=0;i<height+2;i++) {
			//第一列
			blocked[i][0]=wall;
			//最后一列
			blocked[i][width+1]=wall;
		}
		
		for(int j=0;j<width+2;j++) {
			//第一行
			blocked[0][j]=wall;
			//最后一行
			blocked[height+1][j]=wall;
		}
		for(int i=1;i<height+1;i++) {
			for(int j=1;j<width+1;j++) {
				blocked[i][j]=root;
			}
		}
	}
	/**
 * 迷宫生成算法，采用递归方式实现，随机画横竖两条线，然后在线上随机开三扇门
 * @param x：迷宫起点的x坐标
 * @param y：迷宫起点的y坐标
 * @param height：迷宫的高度
 * @param width：迷宫的宽度
 * ***********
 * *         *
 * *         *
 * ***********
 * 针对上述迷宫，四个参数为：1,1,2,9
 * 在偶数置墙壁，奇数开洞
 * 对小迷宫执行上面的两步直到迷宫高度或宽度为1为止
 */
	
	 /**
 * 在给定的线上打开一扇位置随机的门
 */
private  void openAdoor(int x1, int y1, int x2, int y2) {
    int pos;
    if (x1 == x2) {
        pos = y1 + r.nextInt((y2 - y1 )/2+ 1)*2;//在奇数位置开门
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
	           

	        //横着画线，在偶数位置画线
	        xPos=x+r.nextInt(height/2)*2+1;
	        for (int i = y; i < y + width; i++) {
	            blocked[xPos][i] = wall;
	        }

	        //竖着画一条线，在偶数位置画线
	        yPos=y+r.nextInt(width/2)*2+1;
	        for (int i = x; i < x + height; i++) {
	            blocked[i][yPos] = wall;
	        }

	        //随机开三扇门，左侧墙壁为1，逆时针旋转
	        
	      
	        	openAdoor(xPos, y, xPos, yPos - 1);// 1
	        	openAdoor(xPos + 1, yPos, x + height - 1, yPos);// 2
				openAdoor(xPos, yPos + 1, xPos, y + width - 1);// 3
				openAdoor(x, yPos, xPos - 1, yPos);// 4
	    
	        

	        // 左上角
	        genMaze(x, y, xPos - x, yPos - y);
	        // 右上角
	        genMaze(x, yPos + 1, xPos - x, width - yPos + y - 1);
	        // 左下角
	        genMaze(xPos + 1, y, height - xPos + x - 1, yPos - y);
	        // 右下角
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
 * //减少的数值，控制大小，减少数值越小，图越大,内循环控制宽度，外循环控制长度
 * 
 * 
 * 				//最大的减少值
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

//生成特殊形状的迷宫
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
	//存到数组
	public void show(){
		//内循环控制宽度，外循环控制长度
	
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
	
	//初始化数组
	
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
	
	//生成地图
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

//引用文件
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


//生成迷宫的抽象类
abstract class maze{
	abstract public int[][] returnMaze(); 
}




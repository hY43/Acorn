
	// 카운터 변수 
	var counter = 0 ;
	var cnt  = 0;

	// 컨텍스트 객체 
	var ctx ;
	// 우주배경 이미지 객체 
	var bgImg1 = new Image();
	var bgImg2 = new Image();
	// 배경 이미지 소스
	bgImg1.src = "../images/space.jpg";
	bgImg2.src = "../images/space.jpg";
	// 배경 이미지 y좌표 변수 
	var bgY1 = 0;
	var bgY2 = -600;
	// 적비행기 이미지 객체 
	var enemyShip1 = new Image();
	var enemyShip2 = new Image();
	var enemyShip3 = new Image();
	var enemyShip4 = new Image();

	// 적비행기 소스 
	enemyShip1.src = "../images/gunship0.png";
	enemyShip2.src = "../images/gunship1.png";
	enemyShip3.src = "../images/gunship2.png";
	enemyShip4.src = "../images/gunship3.png";

	//  적 비행기 x,y 좌표 
	var enemyX = 250;
	var enemyY = 10;

	// 점수 
	var score = 0 ;

	// 적 비행기 스피드 

	var enemySpeed = 5;

	// 비행기 이미지 객체 
	var ship1 = new Image();
	var ship2 = new Image();
	var ship3 = new Image();
	var ship4 = new Image();
	// 소스
	ship1.src = "../images/gunship4.png";
	ship2.src = "../images/gunship5.png";
	ship3.src = "../images/gunship6.png";
	ship4.src = "../images/gunship7.png";
	// 비행기의 좌표 변수 
	var shipX = 250;
	var shipY = 500;

	// 미사일 발사 소리 객체 
	var missileSound = new Audio("../sounds/missile.wav");

	// 폭발 소리 객체 
	var exSound = new Audio("../sounds/explosion.wav");
	// 미사일 이미지 객체 
	var missileImg = new Image();
	missileImg.src = "../images/missile1.png";

	// 미사일의 y좌표 변수 
	var missileY = 500;
	var missileX = -100;

	// 미사일 배열 
	var missileArray = [];

	// 적비행기 배열 
	var enemyArray = [];

	// 캔버스 객체 
	var canvas ;

	// 게임진행 flag 
	var gameFlag = true;

	// 비행기 이미지 교차 출력 
	function moveShip(e){
		//console.log(e.x + " :  "+  e.y);
		shipX = e.x;
		shipY = e.y;

	}
	function fireMissile(e){
		cnt++;
		missileSound.currentTime= 0 ;
		missileSound.play();
		var m = { 
			"X":shipX,
			"Y":shipY
		};
		if(cnt%2==0) m.X+=25
		else m.X-=25;

		missileArray.push(m);
		
	}

	window.onload = function (){
		canvas = 
		document.getElementById("myCanvas");
		ctx = canvas.getContext("2d");

		console.log(ctx);
		
		canvas.onmousemove=moveShip;
		// 캔버스에서 마우스가 눌리면 
		canvas.onmousedown=fireMissile;
		setInterval(drawScreen,30);

	}
	function makeEnemy(){
		// 객체 
		var e = {
			x:Math.floor(Math.random()*400) , 
			y: -50, 
			hp:100,
			isAlive: true
		}
		enemyArray.push(e);
	}

	function drawScreen(){
		counter++;
		bgY1 += 2;
		bgY2 += 2;

		if(counter %30 == 0) makeEnemy();

		if(bgY1>=600){
			bgY1 = -600;
			bgY2 = 0 ;
		}
		if(bgY2 >= 600){
			bgY2 = -600;
			bgY1 = 0;
		}

		//console.log(counter);
		// ctx.drawImage(이미지객체 , x, y, 너비 , 높이);
		ctx.drawImage(bgImg1,0,bgY1,400,600)
		ctx.drawImage(bgImg2,0,bgY2,400,600)
		// 비행기 그리기 
		if(counter%4==0)ctx.drawImage(ship1, shipX-25,shipY-25,50,50);
		else if(counter%4==1)ctx.drawImage(ship2, shipX-25,shipY-25,50,50);
		else if(counter%4==2)ctx.drawImage(ship3,shipX-25,shipY-25,50,50);
		else ctx.drawImage(ship4, shipX-25,shipY-25,50,50);

		// 적 비행기 그리기 
		for(var i = 0 ; i <  enemyArray.length; i++){
			var e = enemyArray[i];
			e.y += enemySpeed;
		if(counter%4==0)ctx.drawImage(enemyShip1, e.x,e.y,50,50);
		else if(counter%4==1)ctx.drawImage(enemyShip2, e.x,e.y,50,50);
		else if(counter%4==2)ctx.drawImage(enemyShip3, e.x,e.y,50,50);
		else if(counter%4==3)ctx.drawImage(enemyShip4,e.x,e.y,50,50);
		if(e.y>= 650) enemyArray.splice(i,1);
		}

		//console.log(enemyArray);

		for(var i = 0 ;i < missileArray.length;i++){
			var m = missileArray[i];
				// 미사일 이동 
			m.Y-= 5;
		//미사일 그리기 
			ctx.drawImage(missileImg,m.X,m.Y,5,20);
		// 100,100
			// 화면 밖을 나가면 
			if(m.Y <= -20)missileArray.splice(i,1);

		}
			// console.log(missileArray);
		checkCollision(); // 충돌체크 
		// 내 비행기와 적 비행기가 충돌하는지 검사
		checkCollision2();

		if(!gameFlag){
			enemySpeed = 0;
			canvas.onmousedown = '';
			canvas.onmousemove = '';
			console.log("게임 끝났어 집에가 ~~~");

			ctx.font="40px 고딕";
			ctx.fillStyle="red";
			ctx.fillText("Game Over",80,250);

		}

		// 스코어 출력 
		ctx.font="30px 고딕";
		ctx.fillStyle="white";
		ctx.fillText("SCORE : "+ score,80,20);

		
	} // drawScreen()    end 
	function restart(){
			gameFlag = true;
			enemySpeed = 5;
			canvas.onmousedown = fireMissile;
			canvas.onmousemove = moveShip;
			console.log("다시 시작");
			enemyArray = [];
			missileArray = [];
	}
	// 파타고라스 정리 함수 가져오기 
	function  pythagoras(x1,y1,x2,y2){
		return Math.sqrt((x1 - x2)*(x1 - x2) + (y2-y1)*(y2-y1));
	}

	function checkCollision(){
		// 1. 미사일 배열에서 미사일 하나 꺼내기
		for (var i = 0 ;i< missileArray.length;i++){
			var missile  = missileArray[i];
		// 2. 적비행기 배열에서 적 비행기 하나 꺼내기 
			for( var j = 0 ; j< enemyArray.length;j++){
				var enemy = enemyArray[j];
		// 3. 둘간의 거리를 측정 
				var dis = pythagoras(missile.X, missile.Y, enemy.x+25, enemy.y+25);
				if(dis <= 20) {
					enemy.y -= 5;
					enemy.hp -= 50;
					// missile.y -= 20;
					missileArray.splice(i,1);
					if(enemy.hp <=0){
						score += 10;
						enemy.isAlive=false;
						enemyArray.splice(j,1);
						console.log("으악~~");
						exSound.currentTime = 0 ;
						exSound.play();
					}
				}
			}
		} 
		// 4. 일정 거리 이하면 충돌 
		// 5. 충돌이라면 미사일과 , 적비행기를 각각의 배열에서 제거 
		// 6.  아니라면 1번부터 다시 


	}

	function checkCollision2(){
		for(var i = 0 ; i < enemyArray.length; i++){
			var enemy  = enemyArray[i];
			var dis = pythagoras(shipX , shipY, 
				enemy.x+25, enemy.y+25);

			if(dis<=27){
				gameFlag = false;
			}

		}

	}

public class Partie {

	private static int nombreJoueur = 0;
	private static int jActif = 0;
	
	public static Joueur joueur1;
	public static Joueur joueur2;
	public static Joueur joueur3;
	public static Joueur joueur4;
	public static Joueur joueur5;
	public static Joueur joueur6;
	public static Case case0, case1, case2, case3, case4, case5, case6, case7, case8, case9,
	case10, case11, case12, case13, case14, case15, case16, case17, case18, case19,
	case20, case21, case22, case23, case24, case25, case26, case27, case28, case29,
	case30, case31, case32, case33, case34, case35, case36, case37, case38, case39,
	case40, case41, case42, case43, case44, case45, case46, case47, case48, case49,
	case50, case51, case52, case53, case54, case55, case56, case57, case58, case59,
	case60, case61, case62, case63, case64; 
	public static CarteAction ca0, ca1, ca2, ca3, ca4, ca5, ca6, ca7, ca8, ca9,
	 ca10, ca11, ca12, ca13, ca14, ca15, ca16, ca17, ca18, ca19,
	 ca20, ca21, ca22, ca23, ca24, ca25, ca26, ca27, ca28, ca29,
	 ca30, ca31, ca32, ca33, ca34, ca35, ca36, ca37, ca38, ca39,
	 ca40, ca41, ca42, ca43, ca44, ca45, ca46, ca47, ca48, ca49,
	 ca50, ca51, ca52, ca53, ca54, ca55, ca56, ca57, ca58, ca59,
	 ca60, ca61, ca62, ca63, ca64, ca65, ca66, ca67, ca68, ca69,
	 ca70, ca71, ca72, ca73, ca74, ca75, ca76, ca77, ca78, ca79,
	 ca80, ca81, ca82, ca83, ca84, ca85, ca86, ca87, ca88, ca89,
	 ca90, ca91, ca92, ca93, ca94, ca95, ca96, ca97, ca98, ca99,
	 ca100, ca101, ca102, ca103, ca104, ca105, ca106, ca107, ca108, ca109,
	 ca110, ca111, ca112, ca113, ca114, ca115, ca116, ca117, ca118, ca119,
	 ca120, ca121, ca122, ca123, ca124, ca125, ca126, ca127, ca128, ca129,
	 ca130, ca131, ca132, ca133, ca134, ca135, ca136, ca137, ca138, ca139,
	 ca140, ca141, ca142, ca143;
	
	public Partie()
	{
		creationJoueur(nombreJoueur);
		initCase();
		initCarteAction();
	}

	//-------------------------------------INITIALISATION---------------------------------------//
	
	private static void creationJoueur(int nombreJoueur) {
		System.out.println("dans creation joueur");
		int argentDepart = distribution(nombreJoueur);
		for(int i = 1; i <= nombreJoueur; i++)
		{
			switch(i)
			{
				case 1:
					joueur1 = new Joueur(i);
					joueur1.setArgent(argentDepart);
					joueur1.setCouleur("Images/CouleurJ1.png");
					joueur1.setPos(0);
					joueur1.setSlideX(0);
					joueur1.setSlideY(0);
					break;
				case 2:
					joueur2 = new Joueur(i);
					joueur2.setArgent(argentDepart);
					joueur2.setCouleur("Images/CouleurJ2.png");
					joueur2.setPos(0);
					joueur2.setSlideX(48);
					joueur2.setSlideY(0);
					break;
				case 3:
					joueur3 = new Joueur(i);
					joueur3.setArgent(argentDepart);
					joueur3.setCouleur("Images/CouleurJ3.png");
					joueur3.setPos(0);
					joueur3.setSlideX(0);
					joueur3.setSlideY(22);
					break;
				case 4:
					joueur4 = new Joueur(i);
					joueur4.setArgent(argentDepart);
					joueur4.setCouleur("Images/CouleurJ4.png");
					joueur4.setPos(0);
					joueur4.setSlideX(48);
					joueur4.setSlideY(22);
					break;
				case 5:
					joueur5 = new Joueur(i);
					joueur5.setArgent(argentDepart);
					joueur5.setCouleur("Images/CouleurJ5.png");
					joueur5.setPos(0);
					joueur5.setSlideX(0);
					joueur5.setSlideY(44);
					break;
				case 6:
					joueur6 = new Joueur(i);
					joueur6.setArgent(argentDepart);
					joueur6.setCouleur("Images/CouleurJ6.png");
					joueur6.setPos(0);
					joueur6.setSlideX(48);
					joueur6.setSlideY(44);
					break;
			}
		}		
	}
	
	private static int distribution(int nombreJoueur) {
		//370 000 000
		int argentDepart = 0;
		
		switch(nombreJoueur)
		{
			case 2:
				argentDepart = 123000000;
				break;
				
			case 3:
				argentDepart = 92500000;
				break;
				
			case 4:
				argentDepart = 74000000;
				break;
				
			case 5:
				argentDepart = 61500000;
				break;
				
			case 6:
				argentDepart = 53000000;
				break;
				
			
		}
		
		return  argentDepart;
	}
	
	public static void initCase() {
		
		case0 = new Case();
		case0.setCaseX(340);
		case0.setCaseY(72);
		case0.setCaseEvent(0);
		case0.setId(0);
		case1 = new Case();
		case1.setCaseX(411);
		case1.setCaseY(72);
		case1.setCaseEvent(1);
		case1.setId(1);
		case2 = new Case();
		case2.setCaseX(476);
		case2.setCaseY(72);
		case2.setCaseEvent(1);
		case2.setId(2);
		case3= new Case();
		case3.setCaseX(541);
		case3.setCaseY(72);
		case3.setCaseEvent(1);
		case3.setId(3);
		case4 = new Case();
		case4.setCaseX(604);
		case4.setCaseY(72);
		case4.setCaseEvent(1);
		case4.setId(4);
		case5 = new Case();
		case5.setCaseX(666);
		case5.setCaseY(72);
		case5.setCaseEvent(1);
		case5.setId(5);
		case6 = new Case();
		case6.setCaseX(728);
		case6.setCaseY(72);
		case6.setCaseEvent(1);
		case6.setId(6);
		case7 = new Case();
		case7.setCaseX(788);
		case7.setCaseY(72);
		case7.setCaseEvent(1);
		case7.setId(7);
		case8 = new Case();
		case8.setCaseX(848);
		case8.setCaseY(72);
		case8.setCaseEvent(1);
		case8.setId(8);
		case9 = new Case();
		case9.setCaseX(908);
		case9.setCaseY(72);
		case9.setCaseEvent(1);
		case9.setId(9);
		
		case10 = new Case();
		case10.setCaseX(968);
		case10.setCaseY(72);
		case10.setCaseEvent(2);
		case10.setId(10);
		case11 = new Case();
		case11.setCaseX(968);
		case11.setCaseY(142);
		case11.setCaseEvent(5);
		case11.setId(11);
		case12 = new Case();
		case12.setCaseX(968);
		case12.setCaseY(211);
		case12.setCaseEvent(4);
		case12.setId(12);
		case13 = new Case();
		case13.setCaseX(968);
		case13.setCaseY(280);
		case13.setCaseEvent(1);
		case13.setId(13);
		case14 = new Case();
		case14.setCaseX(970);
		case14.setCaseY(348);
		case14.setCaseEvent(1);
		case14.setId(14);
		case15 = new Case();
		case15.setCaseX(970);
		case15.setCaseY(415);
		case15.setCaseEvent(1);
		case15.setId(15);
		case16 = new Case();
		case16.setCaseX(970);
		case16.setCaseY(485);
		case16.setCaseEvent(4);
		case16.setId(16);
		case17= new Case();
		case17.setCaseX(970);
		case17.setCaseY(553);
		case17.setCaseEvent(5);
		case17.setId(17);
		case18 = new Case();
		case18.setCaseX(970);
		case18.setCaseY(625);
		case18.setCaseEvent(3);
		case18.setId(18);
		case19 = new Case();
		case19.setCaseX(911);
		case19.setCaseY(625);
		case19.setCaseEvent(1);
		case19.setId(19);
		
		case20 = new Case();
		case20.setCaseX(851);
		case20.setCaseY(625);
		case20.setCaseEvent(1);
		case20.setId(20);
		case21 = new Case();
		case21.setCaseX(791);
		case21.setCaseY(625);
		case21.setCaseEvent(1);
		case21.setId(21);
		case22 = new Case();
		case22.setCaseX(732);
		case22.setCaseY(625);
		case22.setCaseEvent(1);
		case22.setId(22);
		case23 = new Case();
		case23.setCaseX(671);
		case23.setCaseY(625);
		case23.setCaseEvent(1);
		case23.setId(23);
		case24 = new Case();
		case24.setCaseX(609);
		case24.setCaseY(625);
		case24.setCaseEvent(1);
		case24.setId(24);
		case25 = new Case();
		case25.setCaseX(545);
		case25.setCaseY(625);
		case25.setCaseEvent(1);
		case25.setId(25);
		case26 = new Case();
		case26.setCaseX(480);
		case26.setCaseY(625);
		case26.setCaseEvent(4);
		case26.setId(26);
		case27 = new Case();
		case27.setCaseX(414);
		case27.setCaseY(625);
		case27.setCaseEvent(5);
		case27.setId(27);
		case28 = new Case();
		case28.setCaseX(346);
		case28.setCaseY(625);
		case28.setCaseEvent(2);
		case28.setId(28);
		case29 = new Case();
		case29.setCaseX(346);
		case29.setCaseY(556);
		case29.setCaseEvent(1);
		case29.setId(29);
		
		case30 = new Case();
		case30.setCaseX(346);
		case30.setCaseY(487);
		case30.setCaseEvent(1);
		case30.setId(30);
		case31 = new Case();
		case31.setCaseX(346);
		case31.setCaseY(418);
		case31.setCaseEvent(1);
		case31.setId(31);
		case32 = new Case();
		case32.setCaseX(346);
		case32.setCaseY(349);
		case32.setCaseEvent(1);
		case32.setId(32);
		case33 = new Case();
		case33.setCaseX(346);
		case33.setCaseY(279);
		case33.setCaseEvent(1);
		case33.setId(33);
		case34 = new Case();
		case34.setCaseX(346);
		case34.setCaseY(211);
		case34.setCaseEvent(1);
		case34.setId(34);
		case35 = new Case();
		case35.setCaseX(346);
		case35.setCaseY(142);
		case35.setCaseEvent(1);
		case35.setId(35);
		case36 = new Case();
		case36.setCaseX(411);
		case36.setCaseY(142);
		case36.setCaseEvent(3);
		case36.setId(36);
		case37 = new Case();
		case37.setCaseX(477);
		case37.setCaseY(142);
		case37.setCaseEvent(5);
		case37.setId(37);
		case38 = new Case();
		case38.setCaseX(542);
		case38.setCaseY(142);
		case38.setCaseEvent(1);
		case38.setId(38);
		case39 = new Case();
		case39.setCaseX(605);
		case39.setCaseY(142);
		case39.setCaseEvent(1);
		case39.setId(39);
	
		case40 = new Case();
		case40.setCaseX(668);
		case40.setCaseY(142);
		case40.setCaseEvent(4);
		case40.setId(40);
		case41 = new Case();
		case41.setCaseX(729);
		case41.setCaseY(142);
		case41.setCaseEvent(5);
		case41.setId(41);
		case42 = new Case();
		case42.setCaseX(790);
		case42.setCaseY(142);
		case42.setCaseEvent(2);
		case42.setId(42);
		case43 = new Case();
		case43.setCaseX(849);
		case43.setCaseY(142);
		case43.setCaseEvent(1);
		case43.setId(43);
		case44 = new Case();
		case44.setCaseX(908);
		case44.setCaseY(142);
		case44.setCaseEvent(1);
		case44.setId(44);
		case45 = new Case();
		case45.setCaseX(907);
		case45.setCaseY(211);
		case45.setCaseEvent(1);
		case45.setId(45);
		case46 = new Case();
		case46.setCaseX(907);
		case46.setCaseY(279);
		case46.setCaseEvent(1);
		case46.setId(46);
		case47 = new Case();
		case47.setCaseX(907);
		case47.setCaseY(347);
		case47.setCaseEvent(1);
		case47.setId(47);
		case48 = new Case();
		case48.setCaseX(909);
		case48.setCaseY(416);
		case48.setCaseEvent(1);
		case48.setId(48);
		case49 = new Case();
		case49.setCaseX(909);
		case49.setCaseY(484);
		case49.setCaseEvent(1);
		case49.setId(49);
		
		case50 = new Case();
		case50.setCaseX(910);
		case50.setCaseY(553);
		case50.setCaseEvent(3);
		case50.setId(50);
		case51 = new Case();
		case51.setCaseX(851);
		case51.setCaseY(553);
		case51.setCaseEvent(5);
		case51.setId(51);
		case52 = new Case();
		case52.setCaseX(792);
		case52.setCaseY(553);
		case52.setCaseEvent(1);
		case52.setId(52);
		case53 = new Case();
		case53.setCaseX(732);
		case53.setCaseY(553);
		case53.setCaseEvent(1);
		case53.setId(53);
		case54 = new Case();
		case54.setCaseX(672);
		case54.setCaseY(553);
		case54.setCaseEvent(4);
		case54.setId(54);
		case55 = new Case();
		case55.setCaseX(610);
		case55.setCaseY(553);
		case55.setCaseEvent(5);
		case55.setId(55);
		case56 = new Case();
		case56.setCaseX(545);
		case56.setCaseY(553);
		case56.setCaseEvent(1);
		case56.setId(56);
		case57 = new Case();
		case57.setCaseX(480);
		case57.setCaseY(553);
		case57.setCaseEvent(1);
		case57.setId(57);
		case58 = new Case();
		case58.setCaseX(413);
		case58.setCaseY(556);
		case58.setCaseEvent(3);
		case58.setId(58);
		case59 = new Case();
		case59.setCaseX(413);
		case59.setCaseY(486);
		case59.setCaseEvent(5);
		case59.setId(59);
		
		case60 = new Case();
		case60.setCaseX(413);
		case60.setCaseY(416);
		case60.setCaseEvent(1);
		case60.setId(60);
		case61 = new Case();
		case61.setCaseX(413);
		case61.setCaseY(349);
		case61.setCaseEvent(1);
		case61.setId(61);
		case62 = new Case();
		case62.setCaseX(413);
		case62.setCaseY(280);
		case62.setCaseEvent(4);
		case62.setId(62);
		case63 = new Case();
		case63.setCaseX(413);
		case63.setCaseY(211);
		case63.setCaseEvent(5);
		case63.setId(63);
		case64 = new Case();
		case64.setCaseX(413);
		case64.setCaseY(142);
		case64.setCaseEvent(2);
		case64.setId(64);
		
	}
	
	public static void getEvent(int choix) {
		
		int event = 0;
		
		switch(choix)
		{
			case 10:
				event = case10.getCaseEvent();
				break;
				
			case 11:
				event = case11.getCaseEvent();
				break;

			case 12:
				event = case12.getCaseEvent();
				break;

			case 16:
				event = case16.getCaseEvent();
				break;

			case 17:
				event = case17.getCaseEvent();
				break;

			case 18:
				event = case18.getCaseEvent();
				break;

			case 26:
				event = case26.getCaseEvent();
				break;

			case 27:
				event = case27.getCaseEvent();
				break;

			case 28:
				event = case28.getCaseEvent();
				break;

			case 36:
				event = case36.getCaseEvent();
				break;

			case 37:
				event = case37.getCaseEvent();
				break;

			case 40:
				event = case40.getCaseEvent();
				break;

			case 41:
				event = case41.getCaseEvent();
				break;

			case 42:
				event = case42.getCaseEvent();
				break;

			case 50:
				event = case50.getCaseEvent();
				break;

			case 51:
				event = case51.getCaseEvent();
				break;

			case 54:
				event = case54.getCaseEvent();
				break;

			case 55:
				event = case55.getCaseEvent();
				break;

			case 58:
				event = case58.getCaseEvent();
				break;

			case 59:
				event = case59.getCaseEvent();
				break;

			case 62:
				event = case62.getCaseEvent();
				break;

			case 63:
				event = case63.getCaseEvent();
				break;

			case 64:
				event = case64.getCaseEvent();
				break;
		}
		
		switch(event) {
			case 2:
				
				break;
				
			case 3:
				Plateau.setJoker(true);
				break;

			case 4:
				Plateau.setActu(true);
				//finir MaJ ( desactiver bouton au prochain joueur)
				break;

			case 5:
				
				break;
				
		}
		
	}
	
	public static void initCarteAction() {
		
		ca0 = new CarteAction();
		ca0.setX(2);
		ca0.setY(2);
		ca0.setPrice(500000);
		ca0.setName("CAAcier1");
		ca0.setQuantity(5);
		ca0.setType(1);
		
		ca1 = new CarteAction();
		ca1.setX(2);
		ca1.setY(2);
		ca1.setPrice(500000);
		ca1.setName("CAAcier2");
		ca1.setQuantity(5);
		ca1.setType(1);

		ca2 = new CarteAction();
		ca2.setX(2);
		ca2.setY(2);
		ca2.setPrice(1000000);
		ca2.setName("CAAcier3");
		ca2.setQuantity(10);
		ca2.setType(1);

		ca3 = new CarteAction();
		ca3.setX(2);
		ca3.setY(2);
		ca3.setPrice(2000000);
		ca3.setName("CAAcier4");
		ca3.setQuantity(20);
		ca3.setType(1);
		
		ca4 = new CarteAction();
		ca4.setX(2);
		ca4.setY(2);
		ca4.setPrice(2500000);
		ca4.setName("CAAcier5");
		ca4.setQuantity(25);
		ca4.setType(1);

		ca5 = new CarteAction();
		ca5.setX(2);
		ca5.setY(2);
		ca5.setPrice(2500000);
		ca5.setName("CAAcier6");
		ca5.setQuantity(25);
		ca5.setType(1);

		ca6 = new CarteAction();
		ca6.setX(2);
		ca6.setY(2);
		ca6.setPrice(500000);
		ca6.setName("CAAlu1");
		ca6.setQuantity(5);
		ca6.setType(2);

		ca7 = new CarteAction();
		ca7.setX(2);
		ca7.setY(2);
		ca7.setPrice(500000);
		ca7.setName("CAAlu2");
		ca7.setQuantity(5);
		ca7.setType(2);

		ca8 = new CarteAction();
		ca8.setX(118);
		ca8.setY(2);
		ca8.setPrice(1000000);
		ca8.setName("CAAlu3");
		ca8.setQuantity(10);
		ca8.setType(2);

		ca9 = new CarteAction();
		ca9.setX(2);
		ca9.setY(2);
		ca9.setPrice(2000000);
		ca9.setName("CAAlu4");
		ca9.setQuantity(20);
		ca9.setType(2);

		ca10 = new CarteAction();
		ca10.setX(2);
		ca10.setY(2);
		ca10.setPrice(2000000);
		ca10.setName("CAAlu5");
		ca10.setQuantity(20);
		ca10.setType(2);

		ca11 = new CarteAction();
		ca11.setX(2);
		ca11.setY(2);
		ca11.setPrice(3500000);
		ca11.setName("CAAlu6");
		ca11.setQuantity(35);
		ca11.setType(2);

		ca12 = new CarteAction();
		ca12.setX(118);
		ca12.setY(2);
		ca12.setPrice(1000000);
		ca12.setName("CAArgent1");
		ca12.setQuantity(25);
		ca12.setType(3);

		ca13 = new CarteAction();
		ca13.setX(118);
		ca13.setY(2);
		ca13.setPrice(1500000);
		ca13.setName("CAArgent2");
		ca13.setQuantity(25);
		ca13.setType(3);

		ca14 = new CarteAction();
		ca14.setX(118);
		ca14.setY(2);
		ca14.setPrice(1500000);
		ca14.setName("CAArgent3");
		ca14.setQuantity(25);
		ca14.setType(3);

		ca15 = new CarteAction();
		ca15.setX(2);
		ca15.setY(2);
		ca15.setPrice(1500000);
		ca15.setName("CAArgent4");
		ca15.setQuantity(25);
		ca15.setType(3);

		ca16 = new CarteAction();
		ca16.setX(2);
		ca16.setY(2);
		ca16.setPrice(1500000);
		ca16.setName("CAArgent5");
		ca16.setQuantity(25);
		ca16.setType(3);

		ca17 = new CarteAction();
		ca17.setX(2);
		ca17.setY(2);
		ca17.setPrice(2000000);
		ca17.setName("CAArgent6");
		ca17.setQuantity(25);
		ca17.setType(3);

		/*ca18 = new CarteAction();
		ca18.setX(0);
		ca18.setY(0);
		ca18.setPrice(3000000);
		ca18.setName("CABle1");
		ca18.setQuantity(25);
		ca18.setType(4);

		ca19 = new CarteAction();
		ca19.setX(0);
		ca19.setY(0);
		ca19.setPrice(3000000);
		ca19.setName("CABle2");
		ca19.setQuantity(25);
		ca19.setType(4);
		
		ca20 = new CarteAction();
		ca20.setX(0);
		ca20.setY(0);
		ca20.setPrice(3000000);
		ca20.setName("CABle3");
		ca20.setQuantity(25);
		ca20.setType(4);
		
		ca21 = new CarteAction();
		ca21.setX(0);
		ca21.setY(0);
		ca21.setPrice(3000000);
		ca21.setName("CABle4");
		ca21.setQuantity(25);
		ca21.setType(4);
		
		ca22 = new CarteAction();
		ca22.setX(0);
		ca22.setY(0);
		ca22.setPrice(3000000);
		ca22.setName("CABle5");
		ca22.setQuantity(25);
		ca22.setType(4);
		
		ca23 = new CarteAction();
		ca23.setX(0);
		ca23.setY(0);
		ca23.setPrice(3000000);
		ca23.setName("CABle6");
		ca23.setQuantity(25);
		ca23.setType(4);
		
		/*ca24 = new CarteAction();
		ca24.setX(0);
		ca24.setY(0);
		ca24.setPrice(3000000);
		ca24.setName("CACacao1");
		ca24.setQuantity(25);
		ca24.setType(5);
		
		ca25 = new CarteAction();
		ca25.setX(0);
		ca25.setY(0);
		ca25.setPrice(3000000);
		ca25.setName("CACacao2");
		ca25.setQuantity(25);
		ca25.setType(5);
		
		ca26 = new CarteAction();
		ca26.setX(0);
		ca26.setY(0);
		ca26.setPrice(3000000);
		ca26.setName("CACacao3");
		ca26.setQuantity(25);
		ca26.setType(5);
		
		ca27 = new CarteAction();
		ca27.setX(0);
		ca27.setY(0);
		ca27.setPrice(3000000);
		ca27.setName("CACacao4");
		ca27.setQuantity(25);
		ca27.setType(5);
		
		ca28 = new CarteAction();
		ca28.setX(0);
		ca28.setY(0);
		ca28.setPrice(3000000);
		ca28.setName("CACacao5");
		ca28.setQuantity(25);
		ca28.setType(5);
		
		ca29 = new CarteAction();
		ca29.setX(0);
		ca29.setY(0);
		ca29.setPrice(3000000);
		ca29.setName("CACacao6");
		ca29.setQuantity(25);
		ca29.setType(5);
		
		/*ca30 = new CarteAction();
		ca30.setX(0);
		ca30.setY(0);
		ca30.setPrice(3000000);
		ca30.setName("CACafe1");
		ca30.setQuantity(25);
		ca30.setType(6);
		
		ca31 = new CarteAction();
		ca31.setX(0);
		ca31.setY(0);
		ca31.setPrice(3000000);
		ca31.setName("CACafe2");
		ca31.setQuantity(25);
		ca31.setType(6);
		
		ca32 = new CarteAction();
		ca32.setX(0);
		ca32.setY(0);
		ca32.setPrice(3000000);
		ca32.setName("CACafe3");
		ca32.setQuantity(25);
		ca32.setType(6);
		
		ca33 = new CarteAction();
		ca33.setX(0);
		ca33.setY(0);
		ca33.setPrice(3000000);
		ca33.setName("CACafe4");
		ca33.setQuantity(25);
		ca33.setType(6);
		
		ca34 = new CarteAction();
		ca34.setX(0);
		ca34.setY(0);
		ca34.setPrice(3000000);
		ca34.setName("CACafe5");
		ca34.setQuantity(25);
		ca34.setType(6);
		
		ca35 = new CarteAction();
		ca35.setX(0);
		ca35.setY(0);
		ca35.setPrice(3000000);
		ca35.setName("CACafe6");
		ca35.setQuantity(25);
		ca35.setType(6);
		
		/*ca36 = new CarteAction();
		ca36.setX(0);
		ca36.setY(0);
		ca36.setPrice(3000000);
		ca36.setName("CACaoutchouc1");
		ca36.setQuantity(25);
		ca36.setType(7);
		
		ca37 = new CarteAction();
		ca37.setX(0);
		ca37.setY(0);
		ca37.setPrice(3000000);
		ca37.setName("CACaoutchouc2");
		ca37.setQuantity(25);
		ca37.setType(7);
		
		ca38 = new CarteAction();
		ca38.setX(0);
		ca38.setY(0);
		ca38.setPrice(3000000);
		ca38.setName("CACaoutchouc3");
		ca38.setQuantity(25);
		ca38.setType(7);
		
		ca39 = new CarteAction();
		ca39.setX(0);
		ca39.setY(0);
		ca39.setPrice(3000000);
		ca39.setName("CACaoutchouc4");
		ca39.setQuantity(25);
		ca39.setType(7);
		
		ca40 = new CarteAction();
		ca40.setX(0);
		ca40.setY(0);
		ca40.setPrice(3000000);
		ca40.setName("CACaoutchouc5");
		ca40.setQuantity(25);
		ca40.setType(7);
		
		ca41 = new CarteAction();
		ca41.setX(0);
		ca41.setY(0);
		ca41.setPrice(3000000);
		ca41.setName("CACaoutchouc6");
		ca41.setQuantity(25);
		ca41.setType(7);
		
		ca42 = new CarteAction();
		ca42.setX(0);
		ca42.setY(0);
		ca42.setPrice(3000000);
		ca42.setName("CACobalt1");
		ca42.setQuantity(25);
		ca42.setType(8);
		
		ca43 = new CarteAction();
		ca43.setX(0);
		ca43.setY(0);
		ca43.setPrice(3000000);
		ca43.setName("CACobalt2");
		ca43.setQuantity(25);
		ca43.setType(8);
		
		ca44 = new CarteAction();
		ca44.setX(0);
		ca44.setY(0);
		ca44.setPrice(3000000);
		ca44.setName("CACobalt3");
		ca44.setQuantity(25);
		ca44.setType(8);
		
		ca45 = new CarteAction();
		ca45.setX(0);
		ca45.setY(0);
		ca45.setPrice(3000000);
		ca45.setName("CACobalt4");
		ca45.setQuantity(25);
		ca45.setType(8);
		
		ca46 = new CarteAction();
		ca46.setX(0);
		ca46.setY(0);
		ca46.setPrice(3000000);
		ca46.setName("CACobalt5");
		ca46.setQuantity(25);
		ca46.setType(8);
		
		ca47 = new CarteAction();
		ca47.setX(0);
		ca47.setY(0);
		ca47.setPrice(3000000);
		ca47.setName("CACobalt6");
		ca47.setQuantity(25);
		ca47.setType(8);
		
		ca48 = new CarteAction();
		ca48.setX(0);
		ca48.setY(0);
		ca48.setPrice(3000000);
		ca48.setName("CACAuto1");
		ca48.setQuantity(25);
		ca48.setType(9);
		
		ca49 = new CarteAction();
		ca49.setX(0);
		ca49.setY(0);
		ca49.setPrice(3000000);
		ca49.setName("CACAuto2");
		ca49.setQuantity(25);
		ca49.setType(9);
		
		ca50 = new CarteAction();
		ca50.setX(0);
		ca50.setY(0);
		ca50.setPrice(3000000);
		ca50.setName("CACAuto3");
		ca50.setQuantity(25);
		ca50.setType(9);
		
		ca51 = new CarteAction();
		ca51.setX(0);
		ca51.setY(0);
		ca51.setPrice(3000000);
		ca51.setName("CACAuto4");
		ca51.setQuantity(25);
		ca51.setType(9);
		
		ca52 = new CarteAction();
		ca52.setX(0);
		ca52.setY(0);
		ca52.setPrice(3000000);
		ca52.setName("CACAuto5");
		ca52.setQuantity(25);
		ca52.setType(9);
		
		ca53 = new CarteAction();
		ca53.setX(0);
		ca53.setY(0);
		ca53.setPrice(3000000);
		ca53.setName("CACAuto6");
		ca53.setQuantity(25);
		ca53.setType(9);
		
		ca54 = new CarteAction();
		ca54.setX(0);
		ca54.setY(0);
		ca54.setPrice(3000000);
		ca54.setName("CACNavale1");
		ca54.setQuantity(25);
		ca54.setType(10);
		
		ca55 = new CarteAction();
		ca55.setX(0);
		ca55.setY(0);
		ca55.setPrice(3000000);
		ca55.setName("CACNavale2");
		ca55.setQuantity(25);
		ca55.setType(10);
		
		ca56 = new CarteAction();
		ca56.setX(0);
		ca56.setY(0);
		ca56.setPrice(3000000);
		ca56.setName("CACNavale3");
		ca56.setQuantity(25);
		ca56.setType(10);
		
		ca57 = new CarteAction();
		ca57.setX(0);
		ca57.setY(0);
		ca57.setPrice(3000000);
		ca57.setName("CACNavale4");
		ca57.setQuantity(25);
		ca57.setType(10);
		
		ca58 = new CarteAction();
		ca58.setX(0);
		ca58.setY(0);
		ca58.setPrice(3000000);
		ca58.setName("CACNavale5");
		ca58.setQuantity(25);
		ca58.setType(10);
		
		ca59 = new CarteAction();
		ca59.setX(0);
		ca59.setY(0);
		ca59.setPrice(3000000);
		ca59.setName("CACNavale6");
		ca59.setQuantity(25);
		ca59.setType(10);
		
		ca60 = new CarteAction();
		ca60.setX(0);
		ca60.setY(0);
		ca60.setPrice(3000000);
		ca60.setName("CACBrut1");
		ca60.setQuantity(25);
		ca60.setType(11);
		
		ca61 = new CarteAction();
		ca61.setX(0);
		ca61.setY(0);
		ca61.setPrice(3000000);
		ca61.setName("CACBrut2");
		ca61.setQuantity(25);
		ca61.setType(11);
		
		ca62 = new CarteAction();
		ca62.setX(0);
		ca62.setY(0);
		ca62.setPrice(3000000);
		ca62.setName("CACBrut3");
		ca62.setQuantity(25);
		ca62.setType(11);
		
		ca63 = new CarteAction();
		ca63.setX(0);
		ca63.setY(0);
		ca63.setPrice(3000000);
		ca63.setName("CACBrut4");
		ca63.setQuantity(25);
		ca63.setType(11);
		
		ca64 = new CarteAction();
		ca64.setX(0);
		ca64.setY(0);
		ca64.setPrice(3000000);
		ca64.setName("CACBrut5");
		ca64.setQuantity(25);
		ca64.setType(11);
		
		ca65 = new CarteAction();
		ca65.setX(0);
		ca65.setY(0);
		ca65.setPrice(3000000);
		ca65.setName("CACBrut6");
		ca65.setQuantity(25);
		ca65.setType(11);
		
		ca66 = new CarteAction();
		ca66.setX(0);
		ca66.setY(0);
		ca66.setPrice(3000000);
		ca66.setName("CACuivre1");
		ca66.setQuantity(25);
		ca66.setType(12);
		
		ca67 = new CarteAction();
		ca67.setX(0);
		ca67.setY(0);
		ca67.setPrice(3000000);
		ca67.setName("CACuivre2");
		ca67.setQuantity(25);
		ca67.setType(12);
		
		ca68 = new CarteAction();
		ca68.setX(0);
		ca68.setY(0);
		ca68.setPrice(3000000);
		ca68.setName("CACuivre3");
		ca68.setQuantity(25);
		ca68.setType(12);
		
		ca69 = new CarteAction();
		ca69.setX(0);
		ca69.setY(0);
		ca69.setPrice(3000000);
		ca69.setName("CACuivre4");
		ca69.setQuantity(25);
		ca69.setType(12);
		
		ca70 = new CarteAction();
		ca70.setX(0);
		ca70.setY(0);
		ca70.setPrice(3000000);
		ca70.setName("CACuivre5");
		ca70.setQuantity(25);
		ca70.setType(12);
		
		ca71 = new CarteAction();
		ca71.setX(0);
		ca71.setY(0);
		ca71.setPrice(3000000);
		ca71.setName("CACuivre6");
		ca71.setQuantity(25);
		ca71.setType(12);
		
		ca72 = new CarteAction();
		ca72.setX(0);
		ca72.setY(0);
		ca72.setPrice(3000000);
		ca72.setName("CAFer1");
		ca72.setQuantity(25);
		ca72.setType(13);
		
		ca73 = new CarteAction();
		ca73.setX(0);
		ca73.setY(0);
		ca73.setPrice(3000000);
		ca73.setName("CAFer2");
		ca73.setQuantity(25);
		ca73.setType(13);
		
		ca74 = new CarteAction();
		ca74.setX(0);
		ca74.setY(0);
		ca74.setPrice(3000000);
		ca74.setName("CAFer3");
		ca74.setQuantity(25);
		ca74.setType(13);
		
		ca75 = new CarteAction();
		ca75.setX(0);
		ca75.setY(0);
		ca75.setPrice(3000000);
		ca75.setName("CAFer4");
		ca75.setQuantity(25);
		ca75.setType(13);
		
		ca76 = new CarteAction();
		ca76.setX(0);
		ca76.setY(0);
		ca76.setPrice(3000000);
		ca76.setName("CAFer5");
		ca76.setQuantity(25);
		ca76.setType(13);
		
		ca77 = new CarteAction();
		ca77.setX(0);
		ca77.setY(0);
		ca77.setPrice(3000000);
		ca77.setName("CAFer6");
		ca77.setQuantity(25);
		ca77.setType(13);
		
		ca78 = new CarteAction();
		ca78.setX(0);
		ca78.setY(0);
		ca78.setPrice(500000);
		ca78.setName("CAHouille1");
		ca78.setQuantity(25);
		ca78.setType(14);
		
		ca79 = new CarteAction();
		ca79.setX(0);
		ca79.setY(0);
		ca79.setPrice(1000000);
		ca79.setName("CAHouille2");
		ca79.setQuantity(25);
		ca79.setType(14);
		
		ca80 = new CarteAction();
		ca80.setX(0);
		ca80.setY(0);
		ca80.setPrice(1000000);
		ca80.setName("CAHouille3");
		ca80.setQuantity(25);
		ca80.setType(14);
		
		ca81 = new CarteAction();
		ca81.setX(0);
		ca81.setY(0);
		ca81.setPrice(2000000);
		ca81.setName("CAHouille4");
		ca81.setQuantity(25);
		ca81.setType(14);
		
		ca82 = new CarteAction();
		ca82.setX(0);
		ca82.setY(0);
		ca82.setPrice(2000000);
		ca82.setName("CAHouille5");
		ca82.setQuantity(25);
		ca82.setType(14);
		
		ca83 = new CarteAction();
		ca83.setX(0);
		ca83.setY(0);
		ca83.setPrice(3000000);
		ca83.setName("CAHouille6");
		ca83.setQuantity(25);
		ca83.setType(14);
		
		/*ca84 = new CarteAction();
		ca84.setX(0);
		ca84.setY(0);
		ca84.setPrice(3000000);
		ca84.setName("CAHouille6");
		ca84.setQuantity(25);
		ca84.setType(15);
		
		ca85 = new CarteAction();
		ca85.setX(0);
		ca85.setY(0);
		ca85.setPrice(3000000);
		ca85.setName("CAHouille6");
		ca85.setQuantity(25);
		ca85.setType(15);
		
		ca86 = new CarteAction();
		ca86.setX(0);
		ca86.setY(0);
		ca86.setPrice(3000000);
		ca86.setName("CAHouille6");
		ca86.setQuantity(25);
		ca86.setType(15);
		
		ca87 = new CarteAction();
		ca87.setX(0);
		ca87.setY(0);
		ca87.setPrice(3000000);
		ca87.setName("CAHouille6");
		ca87.setQuantity(25);
		ca87.setType(15);
		
		ca88 = new CarteAction();
		ca88.setX(0);
		ca88.setY(0);
		ca88.setPrice(3000000);
		ca88.setName("CAHouille6");
		ca88.setQuantity(25);
		ca88.setType(15);
		
		ca89 = new CarteAction();
		ca89.setX(0);
		ca89.setY(0);
		ca89.setPrice(3000000);
		ca89.setName("CAHouille6");
		ca89.setQuantity(25);
		ca89.setType(15);
		
		ca90 = new CarteAction();
		ca90.setX(0);
		ca90.setY(0);
		ca90.setPrice(3000000);
		ca90.setName("CAHouille6");
		ca90.setQuantity(25);
		ca90.setType(1);
		
		ca91 = new CarteAction();
		ca91.setX(0);
		ca91.setY(0);
		ca91.setPrice(3000000);
		ca91.setName("CAHouille6");
		ca91.setQuantity(25);
		ca91.setType(1);
		
		ca92 = new CarteAction();
		ca92.setX(0);
		ca92.setY(0);
		ca92.setPrice(3000000);
		ca92.setName("CAHouille6");
		ca92.setQuantity(25);
		ca92.setType(1);
		
		ca93 = new CarteAction();
		ca93.setX(0);
		ca93.setY(0);
		ca93.setPrice(3000000);
		ca93.setName("CAHouille6");
		ca93.setQuantity(25);
		ca93.setType(1);
		
		ca94 = new CarteAction();
		ca94.setX(0);
		ca94.setY(0);
		ca94.setPrice(3000000);
		ca94.setName("CAHouille6");
		ca94.setQuantity(25);
		ca94.setType(1);
		
		ca95 = new CarteAction();
		ca95.setX(0);
		ca95.setY(0);
		ca95.setPrice(3000000);
		ca95.setName("CAHouille6");
		ca95.setQuantity(25);
		ca95.setType(1);
		
		ca96 = new CarteAction();
		ca96.setX(0);
		ca96.setY(0);
		ca96.setPrice(3000000);
		ca96.setName("CAHouille6");
		ca96.setQuantity(25);
		ca96.setType(1);
		
		ca97 = new CarteAction();
		ca97.setX(0);
		ca97.setY(0);
		ca97.setPrice(3000000);
		ca97.setName("CAHouille6");
		ca97.setQuantity(25);
		ca97.setType(1);
		
		ca98 = new CarteAction();
		ca98.setX(0);
		ca98.setY(0);
		ca98.setPrice(3000000);
		ca98.setName("CAHouille6");
		ca98.setQuantity(25);
		ca98.setType(1);
		
		ca99 = new CarteAction();
		ca99.setX(0);
		ca99.setY(0);
		ca99.setPrice(3000000);
		ca99.setName("CAHouille6");
		ca99.setQuantity(25);
		ca99.setType(1);
		
		ca0 = new CarteAction();
		ca0.setX(0);
		ca0.setY(0);
		ca0.setPrice(3000000);
		ca0.setName("CAHouille6");
		ca0.setQuantity(25);
		ca0.setType(1);
		
		ca1 = new CarteAction();
		ca1.setX(0);
		ca1.setY(0);
		ca1.setPrice(3000000);
		ca1.setName("CAHouille6");
		ca1.setQuantity(25);
		ca1.setType(1);
		
		ca2 = new CarteAction();
		ca2.setX(0);
		ca2.setY(0);
		ca2.setPrice(3000000);
		ca2.setName("CAHouille6");
		ca2.setQuantity(25);
		ca2.setType(1);
		
		ca3 = new CarteAction();
		ca3.setX(0);
		ca3.setY(0);
		ca3.setPrice(3000000);
		ca3.setName("CAHouille6");
		ca3.setQuantity(25);
		ca3.setType(1);
		
		ca4 = new CarteAction();
		ca4.setX(0);
		ca4.setY(0);
		ca4.setPrice(3000000);
		ca4.setName("CAHouille6");
		ca4.setQuantity(25);
		ca4.setType(1);
		
		ca5 = new CarteAction();
		ca5.setX(0);
		ca5.setY(0);
		ca5.setPrice(3000000);
		ca5.setName("CAHouille6");
		ca5.setQuantity(25);
		ca5.setType(1);
		
		ca6 = new CarteAction();
		ca6.setX(0);
		ca6.setY(0);
		ca6.setPrice(3000000);
		ca6.setName("CAHouille6");
		ca6.setQuantity(25);
		ca6.setType(1);
		
		ca7 = new CarteAction();
		ca7.setX(0);
		ca7.setY(0);
		ca7.setPrice(3000000);
		ca7.setName("CAHouille6");
		ca7.setQuantity(25);
		ca7.setType(1);
		
		ca8 = new CarteAction();
		ca8.setX(0);
		ca8.setY(0);
		ca8.setPrice(3000000);
		ca8.setName("CAHouille6");
		ca8.setQuantity(25);
		ca8.setType(1);
		
		ca9 = new CarteAction();
		ca9.setX(0);
		ca9.setY(0);
		ca9.setPrice(3000000);
		ca9.setName("CAHouille6");
		ca9.setQuantity(25);
		ca9.setType(1);
		
		ca0 = new CarteAction();
		ca0.setX(0);
		ca0.setY(0);
		ca0.setPrice(3000000);
		ca0.setName("CAHouille6");
		ca0.setQuantity(25);
		ca0.setType(1);
		
		ca1 = new CarteAction();
		ca1.setX(0);
		ca1.setY(0);
		ca1.setPrice(3000000);
		ca1.setName("CAHouille6");
		ca1.setQuantity(25);
		ca1.setType(1);
		
		ca2 = new CarteAction();
		ca2.setX(0);
		ca2.setY(0);
		ca2.setPrice(3000000);
		ca2.setName("CAHouille6");
		ca2.setQuantity(25);
		ca2.setType(1);
		
		ca3 = new CarteAction();
		ca3.setX(0);
		ca3.setY(0);
		ca3.setPrice(3000000);
		ca3.setName("CAHouille6");
		ca3.setQuantity(25);
		ca3.setType(1);
		
		ca4 = new CarteAction();
		ca4.setX(0);
		ca4.setY(0);
		ca4.setPrice(3000000);
		ca4.setName("CAHouille6");
		ca4.setQuantity(25);
		ca4.setType(1);
		
		ca5 = new CarteAction();
		ca5.setX(0);
		ca5.setY(0);
		ca5.setPrice(3000000);
		ca5.setName("CAHouille6");
		ca5.setQuantity(25);
		ca5.setType(1);
		
		ca6 = new CarteAction();
		ca6.setX(0);
		ca6.setY(0);
		ca6.setPrice(3000000);
		ca6.setName("CAHouille6");
		ca6.setQuantity(25);
		ca6.setType(1);
		
		ca7 = new CarteAction();
		ca7.setX(0);
		ca7.setY(0);
		ca7.setPrice(3000000);
		ca7.setName("CAHouille6");
		ca7.setQuantity(25);
		ca7.setType(1);
		
		ca8 = new CarteAction();
		ca8.setX(0);
		ca8.setY(0);
		ca8.setPrice(3000000);
		ca8.setName("CAHouille6");
		ca8.setQuantity(25);
		ca8.setType(1);
		
		ca9 = new CarteAction();
		ca9.setX(0);
		ca9.setY(0);
		ca9.setPrice(3000000);
		ca9.setName("CAHouille6");
		ca9.setQuantity(25);
		ca9.setType(1);
		
		ca0 = new CarteAction();
		ca0.setX(0);
		ca0.setY(0);
		ca0.setPrice(3000000);
		ca0.setName("CAHouille6");
		ca0.setQuantity(25);
		ca0.setType(1);
		
		ca1 = new CarteAction();
		ca1.setX(0);
		ca1.setY(0);
		ca1.setPrice(3000000);
		ca1.setName("CAHouille6");
		ca1.setQuantity(25);
		ca1.setType(1);
		
		ca2 = new CarteAction();
		ca2.setX(0);
		ca2.setY(0);
		ca2.setPrice(3000000);
		ca2.setName("CAHouille6");
		ca2.setQuantity(25);
		ca2.setType(1);
		
		ca3 = new CarteAction();
		ca3.setX(0);
		ca3.setY(0);
		ca3.setPrice(3000000);
		ca3.setName("CAHouille6");
		ca3.setQuantity(25);
		ca3.setType(1);
		
		ca4 = new CarteAction();
		ca4.setX(0);
		ca4.setY(0);
		ca4.setPrice(3000000);
		ca4.setName("CAHouille6");
		ca4.setQuantity(25);
		ca4.setType(1);
		
		ca5 = new CarteAction();
		ca5.setX(0);
		ca5.setY(0);
		ca5.setPrice(3000000);
		ca5.setName("CAHouille6");
		ca5.setQuantity(25);
		ca5.setType(1);
		
		ca6 = new CarteAction();
		ca6.setX(0);
		ca6.setY(0);
		ca6.setPrice(3000000);
		ca6.setName("CAHouille6");
		ca6.setQuantity(25);
		ca6.setType(1);
		
		ca7 = new CarteAction();
		ca7.setX(0);
		ca7.setY(0);
		ca7.setPrice(3000000);
		ca7.setName("CAHouille6");
		ca7.setQuantity(25);
		ca7.setType(1);
		
		ca8 = new CarteAction();
		ca8.setX(0);
		ca8.setY(0);
		ca8.setPrice(3000000);
		ca8.setName("CAHouille6");
		ca8.setQuantity(25);
		ca8.setType(1);
		
		ca9 = new CarteAction();
		ca9.setX(0);
		ca9.setY(0);
		ca9.setPrice(3000000);
		ca9.setName("CAHouille6");
		ca9.setQuantity(25);
		ca9.setType(1);
		
		ca0 = new CarteAction();
		ca0.setX(0);
		ca0.setY(0);
		ca0.setPrice(3000000);
		ca0.setName("CAHouille6");
		ca0.setQuantity(25);
		ca0.setType(1);
		
		ca1 = new CarteAction();
		ca1.setX(0);
		ca1.setY(0);
		ca1.setPrice(3000000);
		ca1.setName("CAHouille6");
		ca1.setQuantity(25);
		ca1.setType(1);
		
		ca2 = new CarteAction();
		ca2.setX(0);
		ca2.setY(0);
		ca2.setPrice(3000000);
		ca2.setName("CAHouille6");
		ca2.setQuantity(25);
		ca2.setType(1);
		
		ca3 = new CarteAction();
		ca3.setX(0);
		ca3.setY(0);
		ca3.setPrice(3000000);
		ca3.setName("CAHouille6");
		ca3.setQuantity(25);
		ca3.setType(1);
		
		ca4 = new CarteAction();
		ca4.setX(0);
		ca4.setY(0);
		ca4.setPrice(3000000);
		ca4.setName("CAHouille6");
		ca4.setQuantity(25);
		ca4.setType(1);
		
		ca5 = new CarteAction();
		ca5.setX(0);
		ca5.setY(0);
		ca5.setPrice(3000000);
		ca5.setName("CAHouille6");
		ca5.setQuantity(25);
		ca5.setType(1);
		
		ca6 = new CarteAction();
		ca6.setX(0);
		ca6.setY(0);
		ca6.setPrice(3000000);
		ca6.setName("CAHouille6");
		ca6.setQuantity(25);
		ca6.setType(1);
		
		ca7 = new CarteAction();
		ca7.setX(0);
		ca7.setY(0);
		ca7.setPrice(3000000);
		ca7.setName("CAHouille6");
		ca7.setQuantity(25);
		ca7.setType(1);
		
		ca8 = new CarteAction();
		ca8.setX(0);
		ca8.setY(0);
		ca8.setPrice(3000000);
		ca8.setName("CAHouille6");
		ca8.setQuantity(25);
		ca8.setType(1);
		
		ca9 = new CarteAction();
		ca9.setX(0);
		ca9.setY(0);
		ca9.setPrice(3000000);
		ca9.setName("CAHouille6");
		ca9.setQuantity(25);
		ca9.setType(1);
		
		ca0 = new CarteAction();
		ca0.setX(0);
		ca0.setY(0);
		ca0.setPrice(3000000);
		ca0.setName("CAHouille6");
		ca0.setQuantity(25);
		ca0.setType(1);
		
		ca1 = new CarteAction();
		ca1.setX(0);
		ca1.setY(0);
		ca1.setPrice(3000000);
		ca1.setName("CAHouille6");
		ca1.setQuantity(25);
		ca1.setType(1);
		
		ca2 = new CarteAction();
		ca2.setX(0);
		ca2.setY(0);
		ca2.setPrice(3000000);
		ca2.setName("CAHouille6");
		ca2.setQuantity(25);
		ca2.setType(1);
		
		ca3 = new CarteAction();
		ca3.setX(0);
		ca3.setY(0);
		ca3.setPrice(3000000);
		ca3.setName("CAHouille6");
		ca3.setQuantity(25);
		ca3.setType(1);
		
		ca4 = new CarteAction();
		ca4.setX(0);
		ca4.setY(0);
		ca4.setPrice(3000000);
		ca4.setName("CAHouille6");
		ca4.setQuantity(25);
		ca4.setType(1);

*/
		
	}
	
	//---------------------------------RECUPRATION DE DONNEES-----------------------------------//
	
	public static void setNBRjoueur(int choix) {
		
		nombreJoueur = choix;
	}

	public static int getNBRjoueur() {
		
		return nombreJoueur;
	}
	
	public static void setNomJoueur(String saisie, int i){
		
		switch(i)
		{
			case 1:
				joueur1.setNom(saisie);
				break;
			case 2:
				joueur2.setNom(saisie);
				break;
			case 3:
				joueur3.setNom(saisie);
				break;
			case 4:
				joueur4.setNom(saisie);
				break;
			case 5:
				joueur5.setNom(saisie);
				break;
			case 6:
				joueur6.setNom(saisie);
				break;
		}
	}
	
	public static void setActif(int choix) {
		
		jActif = choix;
		
		if(jActif > nombreJoueur)
		{
			jActif = 1;
		}
	}
	
	public static int getActif() {
		
		return jActif;
	}

	//-----------------------------------------JEU----------------------------------------------//
	
	public static void lanceDes() {
		int nombreAleatoireR = 1 + (int)(Math.random() * ((6 - 1) + 1));
		int nombreAleatoireB = 1 + (int)(Math.random() * ((6 - 1) + 1));

		Plateau.setDesRouge(nombreAleatoireR);
		Plateau.setDesBlanc(nombreAleatoireB);
		
		bougerJoueur(nombreAleatoireR + nombreAleatoireB, getActif());
		
	}
	
	public static void bougerJoueur(int choix, int choixActif) {
		
		switch(choixActif) {
		
			case 1:
				int pos1 = joueur1.getPos() + choix;
				if(pos1 > 64){pos1 = pos1 - 64;}
				joueur1.setPos(pos1);
				break;
			case 2:
				int pos2 = joueur2.getPos() + choix;
				if(pos2 > 64){pos2 = pos2 - 64;}
				joueur2.setPos(pos2);
				break;
			case 3:
				int pos3 = joueur3.getPos() + choix;
				if(pos3 > 64){pos3 = pos3 - 64;}
				joueur3.setPos(pos3);
				break;
			case 4:
				int pos4 = joueur4.getPos() + choix;
				if(pos4 > 64){pos4 = pos4 - 64;}
				joueur4.setPos(pos4);
				break;
			case 5:
				int pos5 = joueur5.getPos() + choix;
				if(pos5 > 64){pos5 = pos5 - 64;}
				joueur5.setPos(pos5);
				break;
			case 6:
				int pos6 = joueur6.getPos() + choix;
				if(pos6 > 64){pos6 = pos6 - 64;}
				joueur6.setPos(pos6);
				break;
				
		}
	}
	
	
	
}

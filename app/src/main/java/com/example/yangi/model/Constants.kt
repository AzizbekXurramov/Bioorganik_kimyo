package com.example.yangi.model

object Constants {
    const val USER_NAME:String = "user_name"
    const val JAMI_SAVOL:String ="jami_savol"
    const val TUGRI_JAVOBLAR:String = "tugri_javoblar"


    fun getSavollar():ArrayList<Savollar>{
        val savollarList = ArrayList<Savollar>()

        val savol1 = Savollar(
            1,
            "Qaysi aminokislotalar asosli aminokislotalarga mansub?",
            "Lizin, arginin, gistidin",
            "Lizin, glutamin, arginin, ",
            "Asparagin, lizin, arginin",
            "Triptofan, arginin, prolin",
            1
        )
        savollarList.add(savol1)
        val savol2 = Savollar(
            2,
            "Triptofanning bir harfli nomlanishini ko‘rsating?",
            "W",
            "H",
            "G",
            "T",
            1
        )
        savollarList.add(savol2)
        val savol3 = Savollar(
            3,
            "Aminokislotalarni sifat va miqdoriy analiz qilishda qaysi reagent ishlatiladi?",
            "Ningidrin;",
            "Ketosan",
            "Aldenin",
            "Oksigenin",
            1
        )
        savollarList.add(savol3)
        val savol4 = Savollar(
            4,
            "Lizinning bir harfli nomlanishini ko‘rsating?",
            "V;",
            "K;",
            "F",
            "X",
            2
        )
        savollarList.add(savol4)
        val savol5 = Savollar(
            5,
            "Glutamin kislotasining bir harfli nomlanishini ko‘rsating?",
            "I",
            "G",
            "E",
            "J",
            3
        )
        savollarList.add(savol5)
        val savol6 = Savollar(
            6,
            "Qutbli aminokislotani ko‘rsating?",
            "Phe",
            "Ala",
            "Val",
            "Lys",
            4
        )
        savollarList.add(savol6)
        val savol7 = Savollar(
            7,
            "ENDR harflar qaysi aminokislotalar ketma-ketligini ifodalaydi?",
            "Glu-Asn-Asp-Arg",
            "Tyr-Ser-Ala-Thr",
            "Cys-His-Lys-Val",
            "Phe-Arg-Ala-Ile",
            1
        )
        savollarList.add(savol7)
        val savol8 = Savollar(
            8,
            "Oqsillarning peptid bog‘i xossasi qaysi javobda to’g’ri berilgan?",
            "C-N bog‘i, odatdagi oddiy bog‘, tekislikda yotadi, trans-konfig(a)",
            "C-N- oddiy C-N bog‘idan qisqa tekislikda yotmaydi, trans konfiguratsiyaga ega",
            "C -N bog‘i oddiy C-N bog‘idan qisqa, tekislikda yotadi, sis- konfigur.(b)",
            "C-N bog‘i oddiy C-N bog‘idan uzun, tekislikda yotadi, sis- konfig (b)",
            2
        )
        savollarList.add(savol8)

        val savol9 = Savollar(
            9,
            "Tripeptid qaysi javobda qoidaga binoan to‘g‘ri nomlangan?",
            "Alanil-tirozil-glitsin",
            "Alanin -tirozin-glitsin",
            "Alanil-tirozin-glitsil",
            "Alanil-tirozin-glitsin",
            1
        )
        savollarList.add(savol9)
        val savol10 = Savollar(
            10,
            "Oqsillarning sifat va miqdoriy analizida ishlatiladigan biuret reaksiya qaysi eritma bilan tasirlashishiga asoslangan?",
            "Ningidrin",
            "Mis sulfat",
            "Sulfat kislota",
            "Nitrat kislota ",
            2
        )
        savollarList.add(savol10)
        val savol11 = Savollar(
            11,
            "Kislotali gidroliz vakti ortishi bilan kaysi aminokislotalarni tutish kamayadi?",
            "Sistein, izoleysin, prolin, gistidin",
            "Treonin, valin, triptofan, fenilalanin",
            "Serin, treonin, sistin, sistein",
            "Serin, glutamin kislota ,alanin, sistein",
            3
        )
        savollarList.add(savol11)
        val savol12 = Savollar(
            12,
            "F. Senger uslubida N-oxirgi aminokislotalar qoldig‘ini aniqlash uchun qaysi reagent ishlatiladi?",
            "Trinitroftorbenzol",
            "2,4-Dinitroxlorbenzol",
            "rinitroxlorbenzol",
            "2,4-Dinitroftorbenzol",
            4
        )
        savollarList.add(savol12)
        val savol13 = Savollar(
            13,
            "Dansilxlorid uslubida N-oxirgi aminokislotalar qoldigini aniqlashda qaysi reagent ishlatiladi?",
            "Dimetilaminonaftalinsulfoxlorid ",
            "Metilaminonaftalinsulfoxlorid",
            "Trimetilaminonaftalinsulfoxlorid",
            "Tetrametilaminonaftalinsulfoxlorid;",
            1
        )
        savollarList.add(savol13)
        val savol14 = Savollar(
            14,
            "S.Akabori uslubida S-oxirgi aminokislotalarning qoldig‘ini aniqlash uchun qaysi reagent ishlatiladi?",
            "Gidroksilamin",
            "Gidrazin",
            "Ammiak",
            "25% ammiak",
            2
        )
        savollarList.add(savol14)
        val savol15 = Savollar(
            15,
            "Oqsillar tarkibiga kiruvchi qaysi aminokislotalar tarkibida oltingugurt bo‘ladi?",
            "Ser, Met, His",
            "Cys, Met, Thr",
            "Cys, Cys-Cys, Met",
            "Cys-Cys, Ser, Trp",
            3
        )
        savollarList.add(savol15)
        val savol16 = Savollar(
            16,
            "Edman uslubida aminokislota ketma-ketligi aniqlanganda quyidagi reagentlardan qaysi biri ishlatiladi?",
            "ITFS",
            "FTITS",
            "SFIT",
            "FITS",
            4
        )
        savollarList.add(savol16)
        val savol17 = Savollar(
            17,
            "Edman usulida N-oxirgi aminokislotalar ajralganda hosil bo‘ladigan moddani kursating?",
            "FTG",
            "FGT",
            "GFT",
            "GTF",
            1
        )
        savollarList.add(savol17)
        val savol18 = Savollar(
            18,
            "Edman reaksiyasining birinchi bosqichida peptidning qanday hosilasi hosil bo‘ladi?",
            "FKT",
            "FTK",
            "KFT",
            "KTF",
            2
        )
        savollarList.add(savol18)
        val savol19 = Savollar(
            19,
            "Elyusiya qanday jarayon?",
            "xromatografiyaga taalluqli emas",
            "moddaning ajralishiga taalluqli emas",
            "moddalarning bir biridan ajralib kolonkadan chiqishi",
            "moddalarning birgalikda kolonkadan chiqishi",
            3
        )
        savollarList.add(savol19)
        val savol20 = Savollar(
            20,
            "Peptid sintezida ftalil guruh qaysi guruh yoki guruhlarni himoya qilishda ishlatiladi?",
            "Gidroksil guruhini",
            "Karboksil guruhini",
            "Sulfgidril guruhini;",
            "Aminoguruhini;",
            4
        )
        savollarList.add(savol20)
        val savol21 = Savollar(
            21,
            "Peptidlar sintezida azid usuli qaysi funksional guruhini faollashda qo‘llaniladi?",
            "Karboksil guruhini",
            "Sulfgidril guruhini",
            "Aminoguruhini",
            "Gidroksil guruhini",
            1
        )
        savollarList.add(savol21)
        val savol22 = Savollar(
            22,
            "DNK molekulasining tarkibiga qaysi nukleotid kirmaydi?",
            "Dezoksiguanozin-3’-fosfat",
            "Dezoksi uridin 3’-fosfat",
            "Dezoksitsitidin-3’-fosfat",
            "Dezoksitimidin-2’-fosfat",
            2
        )
        savollarList.add(savol22)
        val savol23 = Savollar(
            23,
            "DNK zanjirini o‘sish jarayonida qaysi ferment ishtirok etadi?",
            "RNK ga bog‘liq DNK polimeraza",
            "RNK ga bog‘liq RNK polimeraza",
            "DNK ga bog‘liq DNK polimeraza",
            "DNK ga bog‘liq RNK polimeraza",
            3
        )
        savollarList.add(savol23)
        val savol24 = Savollar(
            24,
            "Xromosomaning tarkibi nimadan iborat?",
            "Lipoprotein;",
            "Xromoprotein",
            "Metalloprotein",
            "Nukleoprotein",
            4
        )
        savollarList.add(savol24)

        val savol25 = Savollar(
            25,
            "RNK zanjirini o‘sish jarayonida qaysi ferment ishtirok etadi?",
            "RNK ga bog‘liq DNK polimeraza",
            "DNK ga bog‘liq DNK polimeraza",
            "DNK ga bog‘liq RNK polimeraza",
            "RNK ga bog‘liq RNK polimeraza",
            1
        )
        savollarList.add(savol25)
        val savol26 = Savollar(
            26,
            "tRNK ning soni nechta?",
            "28 ta",
            "64 ta",
            "13 ta",
            "35 ta",
            2
        )
        savollarList.add(savol26)
        val savol27 = Savollar(
            27,
            "Ribosomada amalga oshadigan jarayon?",
            "DNK dan RNK sintez bo‘lishi",
            "Nukleotidlarning triplet ko‘rinishi",
            "Oqsil biosintezi",
            "DNK molekulasining ikkilanishi",
            3
        )
        savollarList.add(savol27)
        val savol28 = Savollar(
            28,
            "Har bir triplet aminokislotani qanday ifodalaydi?",
            "DNK orqali",
            "mRNK orqali",
            "rRNK orqali",
            "tRNK orqali",
            4
        )
        savollarList.add(savol28)
        val savol29 = Savollar(
            29,
            "Nukleozidlar va nukleotidlardagi N-glyukozid bog‘lari qanday muhitda barqaror bo‘ladi?",
            "Neytral va ishqoriy muhitda",
            "Turli pH muhitda",
            "Kislotali muhitda",
            "Faqat neytral muhitda",
            1
        )
        savollarList.add(savol29)
        val savol30 = Savollar(
            30,
            "DNK ning umumiy nukleotid tarkibi uchun qanday nisbatlar to‘g‘ri?",
            "T+F=G+C",
            "T+C=A+G",
            "T=G, A=C",
            "T=C, A=G",
            2
        )
        savollarList.add(savol30)
        val savol31 = Savollar(
            31,
            "N-glyukozid bog‘i surin dezoksiribonukleotidlarni, pirimidin dezoksiribo- va ribonukleotidlar bilan solishtirilgandagi gidroliz tezligi?",
            "1 necha marta kup",
            "Bir xil",
            "2 marta kam",
            "10 marta kam",
            3
        )
        savollarList.add(savol31)
        val savol32 = Savollar(
            32,
            "DNK ning umumiy nukleotid tarkibi uchun quyidagi A+T/G+C nisbat nimaga teng?",
            "1 dan kichik",
            "1 dan katta",
            "0,45 dan 2,8 gacha",
            "Xar doim 1 ga teng",
            4
        )
        savollarList.add(savol32)
        val savol33 = Savollar(
            33,
            "A+G/T+C=1 nisbat umumiy nukleotid tarkibi quyidagilarning qaysi biri uchun to‘g‘ri?",
            "DNK",
            "RNK",
            "DNK va RNK",
            "t RNK",
            1
        )
        savollarList.add(savol33)
        val savol34 = Savollar(
            34,
            "DNK qo‘sh spiralining V-formasida spiralning bitta bo‘g‘imi uchun nechta azotli asos to‘g‘ri keladi?",
            "20 juft asos",
            "10 juft asos",
            "15 juft asos",
            "2 juft asos",
            2
        )
        savollarList.add(savol34)
        val savol35 = Savollar(
            35,
            "Raffinoza nechta uglevod qoldig’idan iborat?",
            "4 ta",
            "5 ta",
            "3 ta",
            "1 ta",
            3
        )
        savollarList.add(savol35)
        return savollarList

    }
}
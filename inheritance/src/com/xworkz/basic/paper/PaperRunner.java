package com.xworkz.basic.paper;

    import com.xworkz.basic.paper.notebook.Notebook;

    public class PaperRunner {

        public static void main(String args[])
        {
            Paper paper =new Notebook();
            Notebook notebook =  (Notebook)paper;

            paper.recycle();
            paper.biodegradable();
            notebook.recycle();
            notebook.biodegradable();
        }
    }



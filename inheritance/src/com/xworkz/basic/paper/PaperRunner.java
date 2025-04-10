package com.xworkz.basic.paper;

    import com.xworkz.basic.paper.notebook.Notebook;

    public class PaperRunner {

        public static void main(String args[])
        {
            Paper paper = new Paper();
            paper.recycle();
            paper.biodegradable();

            Notebook notebook = new Notebook();
            notebook.recycle();
            notebook.biodegradable();
        }
    }



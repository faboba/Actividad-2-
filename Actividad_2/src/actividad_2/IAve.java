package actividad_2;
interface IAve {  
    void comer();
}
interface IAveVoladora {  
    void volar();
}

interface IAveNadadora {  
    void nadar();
}

class Loro implements IAve, IAveVoladora{

    @Override
    public void volar() {
        //...
    }

    @Override
    public void comer() {
        //...
    }
}

class Pinguino implements IAve, IAveNadadora{

    @Override
    public void nadar() {
        //...
    }

    @Override
    public void comer() {
        //...
    }
   class Pelicano implements IAve, IAveNadadora, IAveVoladora{

        @Override
        public void comer() {
           //.
        }

        @Override
        public void nadar() {
            
        }

        @Override
        public void volar() {
            
        }
    }
}
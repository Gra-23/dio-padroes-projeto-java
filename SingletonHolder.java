package digital.innovation.one.padrõesProjeto.singleton;

public class SingletonHolder {
    //Criar classe dentro dessa SingletonHolder

    private static class InstanceHolder {
        public static SingletonHolder instancia = new SingletonHolder();
    }
        private SingletonHolder() {
            super();
        }
        public static SingletonHolder getInstancia() {
            return InstanceHolder.instancia;
        }
}
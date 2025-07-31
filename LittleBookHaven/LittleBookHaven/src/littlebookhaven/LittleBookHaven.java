package littlebookhaven;

public class LittleBookHaven {

    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        loadingFrame lf = new loadingFrame();
        lf.setVisible(true);

        try {
            Loader loader = null;

            for (int x = 0; x <= 100; x++) {
                Thread.sleep(65);
                lf.loadValue.setText(x + "%");

                loader = null;

                if (x == 10) loader = new LoadingStage1();
                else if (x == 25) loader = new LoadingStage2();
                else if (x == 47) loader = new LoadingStage3();
                else if (x == 60) loader = new LoadingStage4();
                else if (x == 73) loader = new LoadingStage5();
                else if (x == 95) loader = new LoadingStage6();

                if (loader != null) {
                    lf.loadingLabel.setText(loader.getLoadingMessage());
                }

                lf.progressBar.setValue(x);
            }
            
            loginFrame lg = new loginFrame();
            lg.setVisible(true);
            lf.setVisible(false);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static class Loader {
        public String getLoadingMessage() {
            return "Preparing to start...";
        }
    }

    static class LoadingStage1 extends Loader {
        public String getLoadingMessage() {
            return "Loading resources...";
        }
    }

    static class LoadingStage2 extends Loader {
        public String getLoadingMessage() {
            return "Initializing components...";
        }
    }

    static class LoadingStage3 extends Loader {
        public String getLoadingMessage() {
            return "Connecting database...";
        }
    }
    
    static class LoadingStage4 extends Loader {
        public String getLoadingMessage() {
            return "Generating User Interfaces...";
        }
    }
    
        static class LoadingStage5 extends Loader {
        public String getLoadingMessage() {
            return "Finalizing setup...";
        }
    }

    static class LoadingStage6 extends Loader {
        public String getLoadingMessage() {
            return "Launching application...";
        }
    }
}
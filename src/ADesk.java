public class ADesk extends Desk {

    private final boolean wheel;

    public static class Builder extends Desk.Builder<Builder>{
        private boolean wheel = false;

        public Builder wheel(){
            wheel = true;
            return this;
        }

        @Override
        ADesk build() {
            return new ADesk(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private ADesk(Builder builder) {
        super(builder);
        wheel = builder.wheel;
    }

    public static void main(String[] args) {
        ADesk aDesk = new ADesk.Builder().wheel().build();
    }
}

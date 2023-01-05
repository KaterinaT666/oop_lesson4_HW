package transport;

public enum TypeOfBody {

		SEDAN ("Седан"),
		HATCHBACK ("Хетчбек"),
		COUPE ("Купе"),
		ESTATE ("Универсал"),
		UTILITY_VEHICLE ("Внедорожник"),
		CROSSOVER ("Кроссовер"),
		PICKUP ("Пикап"),
		VAN ("Фургон"),
		MINIVAN ("Минивэн");

		private final String bodyName;

	TypeOfBody(String bodyName) {
			this.bodyName = bodyName;
		}

		public String getBodyName() {
			return bodyName;
		}
}

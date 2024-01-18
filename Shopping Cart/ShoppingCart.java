import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] products = {"Product A", "Product B", "Product C"};
		double[] prices = {20.0, 40.0, 50.0};
		int[] quantities = new int[3];
		boolean[] giftWraps = new boolean[3];
		for (int i = 0; i < products.length; i++) {
			System.out.print("Enter the quantity of " + products[i] + ": ");
			quantities[i] = scanner.nextInt();

			System.out.print("Is " + products[i] + " wrapped as a gift? (true/false): ");
			giftWraps[i] = scanner.nextBoolean();
		}

		double subtotal = 0.0;
		for (int i = 0; i < products.length; i++) {
			subtotal += prices[i] * quantities[i];
		}

		double discount = applyDiscountRules(quantities);
		double giftWrapFee = calculateGiftWrapFee(quantities, giftWraps);
		double shippingFee = calculateShippingFee(quantities);

		double total = subtotal - discount + giftWrapFee + shippingFee;

		System.out.println("\nOrder Details:");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i] + " - Quantity: " + quantities[i] + " - Total: $" + (prices[i] * quantities[i]));
		}

		System.out.println("\nSubtotal: $" + subtotal);
		System.out.println("Discount Applied: $" + discount);
		System.out.println("Gift Wrap Fee: $" + giftWrapFee);
		System.out.println("Shipping Fee: $" + shippingFee);
		System.out.println("Total: $" + total);

		scanner.close();
	}

	private static double applyDiscountRules(int[] quantities) {
		int totalQuantity = 0;
		int maxQuantity = 0;

		for (int quantity : quantities) {
			totalQuantity += quantity;
			maxQuantity = Math.max(maxQuantity, quantity);
		}

		double discount = 0.0;

		if (totalQuantity > 20) {
			discount = Math.max(discount, 0.1 * totalQuantity);
		}

		if (maxQuantity > 10) {
			discount = Math.max(discount, 0.05 * maxQuantity);
		}

		if (totalQuantity > 30 && maxQuantity > 15) {
			discount = Math.max(discount, 0.5 * (totalQuantity - 15));
		}

		if (totalQuantity > 200) {
			discount = Math.max(discount, 10.0);
		}

		return discount;
	}
	private static double calculateGiftWrapFee(int[] quantities, boolean[] giftWraps) {
		double giftWrapFee = 0.0;

		for (int i = 0; i < quantities.length; i++) {
			if (giftWraps[i]) {
				giftWrapFee += quantities[i];
			}
		}

		return giftWrapFee;
	}
	private static double calculateShippingFee(int[] quantities) {
		int totalPackages = 0;

		for (int quantity : quantities) {
			totalPackages += (int) Math.ceil((double) quantity / 10);
		}

		return totalPackages * 5.0;
	}
}

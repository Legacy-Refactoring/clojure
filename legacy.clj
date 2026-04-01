(ns legacy)

(defn register_customer
  ([username email password full_name] nil)
  ([username email password full_name phone] nil)
  ([username email password full_name phone country] nil)
  ([username email password full_name phone country city] nil)
  ([username email password full_name phone country city address] nil))

(defn login_customer [username password] nil)

(defn get_customer [customer_id] nil)

(defn update_customer_profile [customer_id new_email new_phone new_address] nil)

(defn reset_password [email new_password] nil)

(defn verify_email [token] nil)

(defn add_payment_method
  ([customer_id type card_number expiry_month expiry_year cvv holder_name] nil)
  ([customer_id type card_number expiry_month expiry_year cvv holder_name iban] nil))

(defn list_payment_methods [customer_id] nil)

(defn delete_payment_method [pm_id] nil)

(defn process_payment
  ([customer_id payment_method_id amount] nil)
  ([customer_id payment_method_id amount currency] nil)
  ([customer_id payment_method_id amount currency external_order_id] nil)
  ([customer_id payment_method_id amount currency external_order_id ip] nil))

(defn list_payments [customer_id] nil)

(defn get_payment_details [payment_id] nil)

(defn create_refund
  ([payment_id amount] nil)
  ([payment_id amount reason] nil))

(defn process_refund [refund_id] nil)

(defn simulate_chargeback
  ([payment_id amount] nil)
  ([payment_id amount reason] nil))

(defn resolve_chargeback
  ([chargeback_id] nil)
  ([chargeback_id won] nil))

(defn create_fraud_review
  ([payment_id customer_id] nil)
  ([payment_id customer_id score] nil))

(defn decide_fraud_review [review_id decision reviewer_email reviewer_password] nil)

(defn admin_list_all_customers [] nil)

(defn admin_export_all_data [] nil)

(defn search_payments [search_term] nil)

(defn process_recurring_billing [] nil)

(defn handle_webhook [payload] nil)

(defn ban_customer [customer_id] nil)

(defn generate_api_key [customer_id] nil)

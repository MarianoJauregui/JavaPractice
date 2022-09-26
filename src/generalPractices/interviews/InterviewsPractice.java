package generalPractices.interviews;

import java.io.*;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Map;
import java.util.HashMap;

public class InterviewsPractice {
    //We accidentally dropped the database where we store the current billing status for our advertisers. Fortunately, we still have the logs for
    // all the transactions they did, and we can use this to recreate the dropped data.
//
// You are asked to process the financial transactions from the old system to build up a BillingStatus per user to be stored in our new system.
// You should create a class called BillingStatus, which will represent an account state. Each financial transaction represents a modification
// to a BillingStatus. A BillingStatus should be able to ingest new transactions that are generated in our own systems.
//
// Given a collection of financial transactions, we want to generate a BillingStatus instance for each user. This can be represented as a dict:
//     { user_id: BillingStatus(), user_id2: BillingStatus()}
//
// Our BillingStatus class should start with two monetary columns:
//     ‘ad_delivery_pennies’: 0, ‘payment_pennies’: 0
//
// Each transaction can have multiple monetary columns. Upon processing a transaction, the values in the monetary columns should be added to the
// current value in the BillingStatus.
// Expected Output
// {1=ad_delivery_pennies: 7000 payment_pennies: 1000, 2=ad_delivery_pennies: 1000 payment_pennies: 500, 3=payment_pennies: 500}

    // Main class should be named ‘Solution’
        public static void main(String[] args) {
            System.out.println("Hello, World");
            Map<String, Map<String, Integer>> test = new HashMap<>();
            test.put("tran1", Map.<String, Integer>of(
                    "user_id", 1,
                    "ad_delivery_pennies", 1000,
                    "transaction_timestamp", 1500000002
            ));
            test.put("tran2", Map.<String, Integer>of(
                    "user_id", 1,
                    "ad_delivery_pennies", 5000,
                    "transaction_timestamp", 1500000001
            ));
            test.put("tran3", Map.<String, Integer>of(
                    "user_id", 1,
                    "payment_pennies", 500,
                    "transaction_timestamp", 1500000003
            ));
            test.put("tran4", Map.<String, Integer>of(
                    "user_id", 1,
                    "ad_delivery_pennies", 1000,
                    "transaction_timestamp", 1500000004,
                    "payment_pennies", 500
            ));
            test.put("tran5", Map.<String, Integer>of(
                    "user_id", 2,
                    "ad_delivery_pennies", 1000,
                    "transaction_timestamp", 1500000005,
                    "payment_pennies", 500
            ));
            test.put("tran6", Map.<String, Integer>of(
                    "user_id", 2,
                    "payment_pennies", 500,
                    "transaction_timestamp", 1500000005
            ));
            test.put("tran6", Map.<String, Integer>of(
                    "user_id", 3,
                    "payment_pennies", 1000,
                    "transaction_timestamp", 1500000005
            ));
        }
    }

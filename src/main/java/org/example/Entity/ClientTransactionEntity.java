package org.example.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

import org.apache.ignite.IgniteBinary;
import org.apache.ignite.binary.BinaryObject;
import org.apache.ignite.client.IgniteClient;
import org.jetbrains.annotations.NotNull;

public class ClientTransactionEntity {
    private UUID id;
    private String device_uid;
    private Integer transaction_type;
    private String actual_transaction_status;
    private String last_transaction_status_data;
    private String function_id;
    private Integer atmproc_code;
    private LocalDateTime create_date;
    private String utrnno;
    private Integer reversal;
    private String tvn;
    private String mcn;
    private String op_code;
    private String buffer_b;
    private String buffer_c;
    private Integer tsn;
    private String trid;
    private String pan;
    private String expire_date;
    private String aid;
    private String reference_number;
    private String authorization_id;
    private String pan_issuer;
    private Double request_amount;
    private Double commission_iss_amount;
    private Double replace_amount;
    private String currency;
    private String operation_bit_mask;
    private UUID previous_transaction_id;
    private String card_data_entry_mode;
    private UUID request_uid;
    private LocalDateTime transaction_local_date;
    private Integer timezone;
    private Double dispense_counted_amount;
    private Boolean is_repeated;
    private LocalDateTime last_update_date_time;
    private LocalDateTime command_reply_date_time;
    private UUID repeated_transaction_id;
    private String reversal_reason;
    private String application_label;
    private LocalDateTime create_date_as_partition_key;

    public UUID getId(){
        return this.id;
    }

    public void setTransactionData(UUID id, String device_uid, Integer transaction_type, String actual_transaction_status, String last_transaction_status_data, String function_id, Integer atmproc_code, LocalDateTime create_date, String utrnno, Integer reversal, String tvn, String mcn, String op_code, String buffer_b, String buffer_c, Integer tsn, String trid, String pan, String expire_date, String aid, String reference_number, String authorization_id, String pan_issuer, Double request_amount, Double commission_iss_amount, Double replace_amount, String currency, String operation_bit_mask, UUID previous_transaction_id, String card_data_entry_mode, UUID request_uid, LocalDateTime transaction_local_date, Integer timezone, Double dispense_counted_amount, Boolean is_repeated, LocalDateTime last_update_date_time, LocalDateTime command_reply_date_time, UUID repeated_transaction_id, String reversal_reason, String application_label, LocalDateTime create_date_as_partition_key){
        this.id = id;
        this.device_uid = device_uid;
        this.transaction_type = transaction_type;
        this.actual_transaction_status = actual_transaction_status;
        this.last_transaction_status_data = last_transaction_status_data;
        this.function_id = function_id;
        this.atmproc_code = atmproc_code;
        this.create_date = create_date;
        this.utrnno = utrnno;
        this.reversal = reversal;
        this.tvn = tvn;
        this.mcn = mcn;
        this.op_code = op_code;
        this.buffer_b = buffer_b;
        this.buffer_c = buffer_c;
        this.tsn = tsn;
        this.trid = trid;
        this.pan = pan;
        this.expire_date = expire_date;
        this.aid = aid;
        this.reference_number = reference_number;
        this.authorization_id = authorization_id;
        this.pan_issuer = pan_issuer;
        this.request_amount = request_amount;
        this.commission_iss_amount = commission_iss_amount;
        this.replace_amount = replace_amount;
        this.currency = currency;
        this.operation_bit_mask = operation_bit_mask;
        this.previous_transaction_id = previous_transaction_id;
        this.card_data_entry_mode = card_data_entry_mode;
        this.request_uid = request_uid;
        this.transaction_local_date = transaction_local_date;
        this.timezone = timezone;
        this.dispense_counted_amount = dispense_counted_amount;
        this.is_repeated = is_repeated;
        this.last_update_date_time = last_update_date_time;
        this.command_reply_date_time = command_reply_date_time;
        this.repeated_transaction_id = repeated_transaction_id;
        this.reversal_reason = reversal_reason;
        this.application_label = application_label;
        this.create_date_as_partition_key = create_date_as_partition_key;
    }

    @Override
    public String toString(){
        return "ClietnTransactionEntity(id = " + this.id +
            ", device_uid = " + this.device_uid +
            ", transaction_type = " + this.transaction_type +
            ", actual_transaction_status = " + this.actual_transaction_status +
            ", last_transaction_status_data = " + this.last_transaction_status_data +
            ", function_id = " + this.function_id +
            ", atmproc_code = " + this.atmproc_code +
            ", create_date = " + this.create_date +
            ", utrnno = " + this.utrnno +
            ", reversal = " + this.reversal +
            ", tvn = " + this.tvn +
            ", mcn = " + this.mcn +
            ", op_code = " + this.op_code +
            ", buffer_b = " + this.buffer_b +
            ", buffer_c = " + this.buffer_c +
            ", tsn = " + this.tsn +
            ", trid = " + this.trid +
            ", pan = " + this.pan +
            ", expire_date = " + this.expire_date +
            ", aid = " + this.aid +
            ", reference_number = " + this.reference_number +
            ", authorization_id = " + this.authorization_id +
            ", pan_issuer = " + this.pan_issuer +
            ", request_amount = " + this.request_amount +
            ", commission_iss_amount = " + this.commission_iss_amount +
            ", replace_amount = " + this.replace_amount +
            ", currency = " + this.currency +
            ", operation_bit_mask = " + this.operation_bit_mask +
            ", previous_transaction_id = " + this.previous_transaction_id +
            ", card_data_entry_mode = " + this.card_data_entry_mode +
            ", request_uid = " + this.request_uid +
            ", transaction_local_date = " + this.transaction_local_date +
            ", timezone = " + this.timezone +
            ", dispense_counted_amount = " + this.dispense_counted_amount +
            ", is_repeated = " + this.is_repeated +
            ", last_update_date_time = " + this.last_update_date_time +
            ", command_reply_date_time = " + this.command_reply_date_time +
            ", repeated_transaction_id = " + this.repeated_transaction_id +
            ", reversal_reason = " + this.reversal_reason +
            ", application_label = " + this.application_label +
            ", create_date_as_partition_key = " + this.create_date_as_partition_key + ")";
    }

    public BinaryObject toBinaryObject(@NotNull IgniteClient client){
        IgniteBinary binary = client.binary();
        return binary
                .builder("ClientTransaction")
                .setField("id", this.id, UUID.class)
                .setField("device_uid", this.device_uid, String.class)
                .setField("transaction_type", this.transaction_type, Integer.class)
                .setField("actual_transaction_status", this.actual_transaction_status, String.class)
                .setField("last_transaction_status_data", this.last_transaction_status_data, String.class)
                .setField("function_id", this.function_id, String.class)
                .setField("atmproc_code", this.atmproc_code, Integer.class)
                .setField("create_date", this.create_date, LocalDateTime.class)
                .setField("utrnno", this.utrnno, String.class)
                .setField("reversal", this.reversal, Integer.class)
                .setField("tvn", this.tvn, String.class)
                .setField("mcn", this.mcn, String.class)
                .setField("op_code", this.op_code, String.class)
                .setField("buffer_b", this.buffer_b, String.class)
                .setField("buffer_c", this.buffer_c, String.class)
                .setField("tsn", this.tsn, Integer.class)
                .setField("trid", this.trid, String.class)
                .setField("pan", this.pan, String.class)
                .setField("expire_date", this.expire_date, String.class)
                .setField("aid", this.aid, String.class)
                .setField("reference_number", this.reference_number, String.class)
                .setField("authorization_id", this.authorization_id, String.class)
                .setField("pan_issuer", this.pan_issuer, String.class)
                .setField("request_amount", this.request_amount, Double.class)
                .setField("commission_iss_amount", this.commission_iss_amount, Double.class)
                .setField("replace_amount", this.replace_amount, Double.class)
                .setField("currency", this.currency, String.class)
                .setField("operation_bit_mask", this.operation_bit_mask, String.class)
                .setField("previous_transaction_id", this.previous_transaction_id, UUID.class)
                .setField("card_data_entry_mode", this.card_data_entry_mode, String.class)
                .setField("request_uid", this.request_uid, UUID.class)
                .setField("transaction_local_date", this.transaction_local_date, LocalDateTime.class)
                .setField("timezone", this.timezone, Integer.class)
                .setField("dispense_counted_amount", this.dispense_counted_amount, Double.class)
                .setField("is_repeated", this.is_repeated, Boolean.class)
                .setField("last_update_date_time", this.last_update_date_time, LocalDateTime.class)
                .setField("command_reply_date_time", this.command_reply_date_time, LocalDateTime.class)
                .setField("repeated_transaction_id", this.repeated_transaction_id, UUID.class)
                .setField("reversal_reason", this.reversal_reason, String.class)
                .setField("application_label", this.application_label, String.class)
                .setField("create_date_as_partition_key", this.create_date_as_partition_key, LocalDateTime.class)
                .build();
    }
}


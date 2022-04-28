// Code generated by pulumi-gen-awsx DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudtrail

// Defines the log group configuration for the CloudWatch Log Group to send logs to.
type LogGroup struct {
	// The ARN of the KMS Key to use when encrypting log data.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Creates a unique name beginning with the specified prefix
	NamePrefix *string `pulumi:"namePrefix"`
	// Specifies the number of days you want to retain log events in the specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, 3653, and 0. If you select 0, the events in the log group are always retained and never expire.
	RetentionInDays *int `pulumi:"retentionInDays"`
	// A map of tags to assign to the resource. If configured with provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

func init() {
}

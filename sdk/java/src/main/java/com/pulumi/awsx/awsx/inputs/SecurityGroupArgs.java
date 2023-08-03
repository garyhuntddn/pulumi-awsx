// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.awsx.inputs;

import com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs;
import com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The set of arguments for constructing a Security Group resource.
 * 
 */
public final class SecurityGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupArgs Empty = new SecurityGroupArgs();

    /**
     * Security group description. Defaults to `Managed by Pulumi`. Cannot be `&#34;&#34;`. **NOTE**: This field maps to the AWS `GroupDescription` attribute, for which there is no Update API. If you&#39;d like to classify your security groups in a way that can be updated, use `tags`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Security group description. Defaults to `Managed by Pulumi`. Cannot be `&#34;&#34;`. **NOTE**: This field maps to the AWS `GroupDescription` attribute, for which there is no Update API. If you&#39;d like to classify your security groups in a way that can be updated, use `tags`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * 
     */
    @Import(name="egress")
    private @Nullable Output<List<SecurityGroupEgressArgs>> egress;

    /**
     * @return Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * 
     */
    public Optional<Output<List<SecurityGroupEgressArgs>>> egress() {
        return Optional.ofNullable(this.egress);
    }

    /**
     * Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * 
     */
    @Import(name="ingress")
    private @Nullable Output<List<SecurityGroupIngressArgs>> ingress;

    /**
     * @return Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * 
     */
    public Optional<Output<List<SecurityGroupIngressArgs>>> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    /**
     * Name of the security group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the security group. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Instruct the provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
     * 
     */
    @Import(name="revokeRulesOnDelete")
    private @Nullable Output<Boolean> revokeRulesOnDelete;

    /**
     * @return Instruct the provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
     * 
     */
    public Optional<Output<Boolean>> revokeRulesOnDelete() {
        return Optional.ofNullable(this.revokeRulesOnDelete);
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * VPC ID. Defaults to the region&#39;s default VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return VPC ID. Defaults to the region&#39;s default VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private SecurityGroupArgs() {}

    private SecurityGroupArgs(SecurityGroupArgs $) {
        this.description = $.description;
        this.egress = $.egress;
        this.ingress = $.ingress;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.revokeRulesOnDelete = $.revokeRulesOnDelete;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityGroupArgs $;

        public Builder() {
            $ = new SecurityGroupArgs();
        }

        public Builder(SecurityGroupArgs defaults) {
            $ = new SecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Security group description. Defaults to `Managed by Pulumi`. Cannot be `&#34;&#34;`. **NOTE**: This field maps to the AWS `GroupDescription` attribute, for which there is no Update API. If you&#39;d like to classify your security groups in a way that can be updated, use `tags`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Security group description. Defaults to `Managed by Pulumi`. Cannot be `&#34;&#34;`. **NOTE**: This field maps to the AWS `GroupDescription` attribute, for which there is no Update API. If you&#39;d like to classify your security groups in a way that can be updated, use `tags`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param egress Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
         * 
         * @return builder
         * 
         */
        public Builder egress(@Nullable Output<List<SecurityGroupEgressArgs>> egress) {
            $.egress = egress;
            return this;
        }

        /**
         * @param egress Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
         * 
         * @return builder
         * 
         */
        public Builder egress(List<SecurityGroupEgressArgs> egress) {
            return egress(Output.of(egress));
        }

        /**
         * @param egress Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
         * 
         * @return builder
         * 
         */
        public Builder egress(SecurityGroupEgressArgs... egress) {
            return egress(List.of(egress));
        }

        /**
         * @param ingress Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
         * 
         * @return builder
         * 
         */
        public Builder ingress(@Nullable Output<List<SecurityGroupIngressArgs>> ingress) {
            $.ingress = ingress;
            return this;
        }

        /**
         * @param ingress Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
         * 
         * @return builder
         * 
         */
        public Builder ingress(List<SecurityGroupIngressArgs> ingress) {
            return ingress(Output.of(ingress));
        }

        /**
         * @param ingress Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
         * 
         * @return builder
         * 
         */
        public Builder ingress(SecurityGroupIngressArgs... ingress) {
            return ingress(List.of(ingress));
        }

        /**
         * @param name Name of the security group. If omitted, this provider will assign a random, unique name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the security group. If omitted, this provider will assign a random, unique name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param revokeRulesOnDelete Instruct the provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
         * 
         * @return builder
         * 
         */
        public Builder revokeRulesOnDelete(@Nullable Output<Boolean> revokeRulesOnDelete) {
            $.revokeRulesOnDelete = revokeRulesOnDelete;
            return this;
        }

        /**
         * @param revokeRulesOnDelete Instruct the provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
         * 
         * @return builder
         * 
         */
        public Builder revokeRulesOnDelete(Boolean revokeRulesOnDelete) {
            return revokeRulesOnDelete(Output.of(revokeRulesOnDelete));
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId VPC ID. Defaults to the region&#39;s default VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId VPC ID. Defaults to the region&#39;s default VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public SecurityGroupArgs build() {
            $.description = Codegen.stringProp("description").output().arg($.description).def("Managed by Pulumi").getNullable();
            return $;
        }
    }

}
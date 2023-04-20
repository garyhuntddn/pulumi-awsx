// *** WARNING: this file was generated by pulumi-gen-awsx. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Awsx.Ec2.Inputs
{

    /// <summary>
    /// Configuration for NAT Gateways.
    /// </summary>
    public sealed class NatGatewayConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("elasticIpAllocationIds")]
        private List<Input<string>>? _elasticIpAllocationIds;

        /// <summary>
        /// A list of EIP allocation IDs to assign to the NAT Gateways. Optional. If specified, the number of supplied values must match the chosen strategy (either one, or the number of availability zones).
        /// </summary>
        public List<Input<string>> ElasticIpAllocationIds
        {
            get => _elasticIpAllocationIds ?? (_elasticIpAllocationIds = new List<Input<string>>());
            set => _elasticIpAllocationIds = value;
        }

        /// <summary>
        /// The strategy for deploying NAT Gateways.
        /// </summary>
        [Input("strategy", required: true)]
        public Pulumi.Awsx.Ec2.NatGatewayStrategy Strategy { get; set; }

        public NatGatewayConfigurationArgs()
        {
        }
        public static new NatGatewayConfigurationArgs Empty => new NatGatewayConfigurationArgs();
    }
}

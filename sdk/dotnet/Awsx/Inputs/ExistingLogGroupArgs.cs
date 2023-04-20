// *** WARNING: this file was generated by pulumi-gen-awsx. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Awsx.Awsx.Inputs
{

    /// <summary>
    /// Reference to an existing log group.
    /// </summary>
    public sealed class ExistingLogGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Arn of the log group. Only one of [arn] or [name] can be specified.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Name of the log group. Only one of [arn] or [name] can be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Region of the log group. If not specified, the provider region will be used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public ExistingLogGroupArgs()
        {
        }
        public static new ExistingLogGroupArgs Empty => new ExistingLogGroupArgs();
    }
}
